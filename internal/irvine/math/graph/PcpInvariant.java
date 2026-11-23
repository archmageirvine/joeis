package irvine.math.graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Replays regular-language and marked-substring certificates for binary PCP.
 * @author Gregory Morse
 */
public final class PcpInvariant {

  private static final String[][] J16B = {{"0", "01"}, {"1", "100"}, {"100", "0"}};
  private static final Set<String> MARKS = Set.of("100010101", "110000101");
  private static final Dfa ALL = new Dfa(new int[][] {{0, 0}}, new boolean[] {true});

  private PcpInvariant() {
  }

  private static final class Dfa {
    private final int[][] mEdges;
    private final boolean[] mFinal;

    private Dfa(final int[][] edges, final boolean[] finals) {
      mEdges = edges;
      mFinal = finals;
    }

    private int step(int v, final String word) {
      for (int i = 0; i < word.length(); ++i) {
        v = mEdges[v][word.charAt(i) - '0'];
      }
      return v;
    }

    private boolean contains(final String w) {
      return mFinal[step(0, w)];
    }
  }

  private static final class Automaton<K> {
    private final Map<K, Integer> mIds = new HashMap<>();
    private final ArrayList<K> mKeys = new ArrayList<>();
    private final ArrayList<int[]> mRows = new ArrayList<>();
    private final ArrayList<Boolean> mFinals = new ArrayList<>();

    private int add(final K key) {
      return mIds.computeIfAbsent(key, k -> {
        mKeys.add(k);
        return mKeys.size() - 1;
      });
    }

    private Dfa build() {
      final boolean[] finals = new boolean[mFinals.size()];
      for (int i = 0; i < finals.length; ++i) {
        finals[i] = mFinals.get(i);
      }
      return new Dfa(mRows.toArray(new int[0][]), finals);
    }
  }

  private static Dfa language(final String[][] tiles, final int side, final boolean suffix) {
    final Set<String> start = new HashSet<>(Set.of(""));
    if (suffix) {
      for (final String[] row : tiles) {
        for (int k = 0; k < row[side].length(); ++k) {
          start.add(row[side].substring(k));
        }
      }
    }
    final Automaton<Set<String>> graph = new Automaton<>();
    graph.add(start);
    for (int i = 0; i < graph.mKeys.size(); ++i) {
      final Set<String> state = graph.mKeys.get(i);
      graph.mFinals.add(suffix ? state.contains("") : !state.isEmpty());
      final int[] row = new int[2];
      for (int bit = 0; bit < 2; ++bit) {
        final Set<String> next = new HashSet<>();
        final char c = (char) ('0' + bit);
        for (final String old : state) {
          if (old.isEmpty()) {
            for (final String[] t : tiles) {
              if (t[side].charAt(0) == c) {
                next.add(t[side].substring(1));
              }
            }
          } else if (old.charAt(0) == c) {
            next.add(old.substring(1));
          }
        }
        row[bit] = graph.add(next);
      }
      graph.mRows.add(row);
    }
    return graph.build();
  }

  private static int gcd(final int a, final int b) {
    return b == 0 ? Math.abs(a) : gcd(b, a % b);
  }

  private static int ones(final String s) {
    return (int) s.chars().filter(c -> c == '1').count();
  }

  // A residual that can occur in a solution is a suffix of the ahead
  // concatenation and a prefix of a later concatenation on the other side.
  // Its two letter counts also belong to the signed-difference lattice.
  private static Dfa filter(final String[][] tiles, final int side) {
    final Dfa prefix = language(tiles, 1 - side, false);
    final Dfa suffix = language(tiles, side, true);
    final int[][] deltas = new int[tiles.length][2];
    for (int i = 0; i < tiles.length; ++i) {
      final String a = tiles[i][side];
      final String b = tiles[i][1 - side];
      deltas[i][1] = ones(a) - ones(b);
      deltas[i][0] = a.length() - b.length() - deltas[i][1];
    }
    int index = 0;
    for (final int[] a : deltas) {
      for (final int[] b : deltas) {
        index = gcd(index, a[0] * b[1] - a[1] * b[0]);
      }
    }
    final int mod = Math.max(index, 1);
    final boolean[] residues = new boolean[mod * mod];
    residues[0] = true;
    final List<Integer> orbit = new ArrayList<>(List.of(0));
    for (int i = 0; i < orbit.size(); ++i) {
      final int n = orbit.get(i);
      for (final int[] a : deltas) {
        final int k = Math.floorMod(n / mod + a[0], mod) * mod + Math.floorMod(n % mod + a[1], mod);
        if (!residues[k]) {
          residues[k] = true;
          orbit.add(k);
        }
      }
    }
    final Automaton<List<Integer>> g = new Automaton<>();
    g.add(List.of(0, 0, 0, 0));
    for (int i = 0; i < g.mKeys.size(); ++i) {
      final List<Integer> k = g.mKeys.get(i);
      final int a = k.get(0), b = k.get(1), x = k.get(2), y = k.get(3);
      g.mFinals.add(prefix.mFinal[a] && suffix.mFinal[b] && residues[x * mod + y]);
      g.mRows.add(new int[] {g.add(List.of(prefix.mEdges[a][0], suffix.mEdges[b][0], (x + 1) % mod, y)),
        g.add(List.of(prefix.mEdges[a][1], suffix.mEdges[b][1], x, (y + 1) % mod))});
    }
    return g.build();
  }

  private static String successor(final int side, final String w, final String[] tile) {
    final String top = side == 0 ? w + tile[0] : tile[0];
    final String bottom = side == 1 ? w + tile[1] : tile[1];
    if (top.startsWith(bottom)) {
      return "+" + top.substring(bottom.length());
    }
    return bottom.startsWith(top) ? "-" + bottom.substring(top.length()) : null;
  }

  private static boolean included(final Dfa[] inv, final Dfa[] filter, final String state) {
    if (state == null) {
      return true;
    }
    final int s = state.charAt(0) == '+' ? 0 : 1;
    final String w = state.substring(1);
    return !filter[s].contains(w) || inv[s].contains(w);
  }

  private static boolean closes(final String[][] tiles, final Dfa[] inv, final boolean viable) {
    final Dfa[] f = viable ? new Dfa[] {filter(tiles, 0), filter(tiles, 1)} : new Dfa[] {ALL, ALL};
    if (inv[0].contains("") || inv[1].contains("")) {
      return false;
    }
    for (final String[] tile : tiles) {
      if (!included(inv, f, successor(0, "", tile))) {
        return false;
      }
    }
    for (int s = 0; s < 2; ++s) {
      final Dfa d = inv[s], e = f[s];
      for (final String[] tile : tiles) {
        final String consume = tile[1 - s], emit = tile[s];
        for (int n = 1; n < consume.length(); ++n) {
          final String w = consume.substring(0, n);
          if (d.contains(w) && e.contains(w) && !included(inv, f, successor(s, w, tile))) {
            return false;
          }
        }
        // For residuals consume+w, every w is checked by the product DFA.
        final Set<List<Integer>> seen = new HashSet<>();
        final List<List<Integer>> work = new ArrayList<>();
        final List<Integer> initial = List.of(d.step(0, consume), 0, e.step(0, consume), 0);
        work.add(initial);
        seen.add(initial);
        for (int i = 0; i < work.size(); ++i) {
          final List<Integer> q = work.get(i);
          final int a = q.get(0), b = q.get(1), x = q.get(2), y = q.get(3);
          if (d.mFinal[a] && e.mFinal[x] && e.mFinal[e.step(y, emit)] && !d.mFinal[d.step(b, emit)]) {
            return false;
          }
          for (int bit = 0; bit < 2; ++bit) {
            final List<Integer> p = List.of(d.mEdges[a][bit], d.mEdges[b][bit], e.mEdges[x][bit], e.mEdges[y][bit]);
            if (seen.add(p)) {
              work.add(p);
            }
          }
        }
      }
    }
    return true;
  }

  private static boolean captured(final String word) {
    return MARKS.stream().anyMatch(word::contains);
  }

  private static void cross(final String word, final int pos, final String emits, final Set<String> image) {
    for (final String[] tile : J16B) {
      final int stop = pos + tile[0].length();
      final int start = Math.max(pos, 0);
      final int overlap = Math.min(stop, word.length()) - start;
      if (overlap <= 0 || !word.regionMatches(start, tile[0], start - pos, overlap)) {
        continue;
      }
      if (stop < word.length()) {
        cross(word, stop, emits + tile[1], image);
      } else {
        image.add(emits + tile[1]);
        for (int i = 1; i <= stop - word.length(); ++i) {
          if (emits.startsWith(tile[0].substring(tile[0].length() - i))) {
            image.add(emits.substring(i) + tile[1]);
          }
        }
      }
    }
  }

  private static boolean markedProof() {
    Set<String> layer = MARKS;
    for (int i = 0; i < 3; ++i) {
      final Set<String> image = new HashSet<>();
      for (final String w : layer) {
        // A match consumes at most three symbols and emits at least one.
        // For a mark of length >= 7, no match can empty or switch sides
        // during a crossing. Include every overlap at either endpoint.
        if (w.length() < 7) {
          return false;
        }
        for (int j = 0; j < 3; ++j) {
          cross(w, -j, "", image);
        }
      }
      image.removeIf(PcpInvariant::captured);
      layer = image;
    }
    if (!layer.isEmpty()) {
      return false;
    }
    final Set<String> seen = new HashSet<>(Set.of("+"));
    final List<String> todo = new ArrayList<>(seen);
    for (int i = 0; i < todo.size(); ++i) {
      final String s = todo.get(i);
      for (final String[] t : J16B) {
        final String next = successor(s.charAt(0) == '+' ? 0 : 1, s.substring(1), t);
        if (next != null) {
          if (next.length() == 1 || seen.size() > 120_000) {
            return false;
          }
          if (!(next.charAt(0) == '-' && captured(next)) && seen.add(next)) {
            todo.add(next);
          }
        }
      }
    }
    return true;
  }

  private static Dfa parse(final String rows, final String finals) {
    final int[][] edges = Arrays.stream(rows.split(";", -1))
      .map(r -> Arrays.stream(r.split(",", -1)).mapToInt(Integer::parseInt).toArray()).toArray(int[][]::new);
    final boolean[] accept = new boolean[edges.length];
    for (final int[] row : edges) {
      if (row.length != 2 || Arrays.stream(row).anyMatch(v -> v < 0 || v >= edges.length)) {
        throw new IllegalArgumentException("Invalid DFA edge");
      }
    }
    if (!finals.isEmpty() && !"-".equals(finals)) {
      for (final String v : finals.split(",", -1)) {
        accept[Integer.parseInt(v)] = true;
      }
    }
    return new Dfa(edges, accept);
  }

  private static String key(final String[][] tiles) {
    final List<String> parts = new ArrayList<>();
    for (final String[] tile : tiles) {
      parts.add(String.join("/", tile));
    }
    return parts.toString();
  }

  /**
   * Check certificates and recompute the width-three maximum without an assumed horizon.
   * @param args one or more files of regular and viable certificates
   * @throws IOException if a certificate file cannot be read
   */
  public static void main(final String[] args) throws IOException {
    final Set<String> proved = new HashSet<>();
    if (!markedProof()) {
      throw new IllegalStateException("Invalid J16b marked-substring proof");
    }
    proved.add(key(J16B));
    for (final String name : args) {
      try (BufferedReader r = Files.newBufferedReader(Path.of(name))) {
        for (String line; (line = r.readLine()) != null; ) {
          final String[] fields = line.split("\t", -1);
          if (fields.length != 7 || !fields[0].matches("[01]{1,3}/[01]{1,3}(,[01]{1,3}/[01]{1,3}){0,2}")
            || !fields[1].matches("[01]") || !fields[2].matches("[01]")) {
            throw new IllegalArgumentException("Malformed PCP certificate");
          }
          final String[][] tiles = Arrays.stream(fields[0].split(",")).map(s -> s.split("/")).toArray(String[][]::new);
          final String key = key(tiles);
          if ("1".equals(fields[1])) {
            for (final String[] tile : tiles) {
              for (int k = 0; k < 2; ++k) {
                tile[k] = new StringBuilder(tile[k]).reverse().toString();
              }
            }
          }
          if (!closes(tiles, new Dfa[] {parse(fields[3], fields[4]), parse(fields[5], fields[6])}, "1".equals(fields[2])) || !proved.add(key)) {
            throw new IllegalArgumentException("Invalid or duplicate certificate: " + key);
          }
        }
      }
    }
    final int size = proved.size();
    final int maximum = PcpBusyBeaver.maximumWithCheckedCertificates(proved::remove);
    if (!proved.isEmpty()) {
      throw new IllegalArgumentException("Unused certificates: " + proved);
    }
    System.out.println("Verified " + size + " certificates, maximum=" + maximum);
  }
}
