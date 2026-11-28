package irvine.math.group;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;

import irvine.math.q.Q;

/**
 * Exact finite-subgroup containment in the CARAT rational catalogue.
 * @author Gregory Morse
 */
final class RationalGroupCatalogue {

  private RationalGroupCatalogue() { }

  private static final class Candidate {
    private final int mOrder;
    private final Q[][][] mGenerators;
    private RationalGroupContainment.Target mGroup;

    private Candidate(final int order, final List<Q[][]> generators) {
      mOrder = order;
      mGenerators = generators.toArray(new Q[0][][]);
    }

    private RationalGroupContainment.Target group() {
      if (mGroup == null) {
        mGroup = new RationalGroupContainment.Target(mGenerators, mGenerators[0].length, mOrder);
      }
      return mGroup;
    }

    private boolean hasCentralNegation() {
      if ((mOrder & 1) != 0) {
        return false;
      }
      final int n = mGenerators[0].length;
      final Q[][] negative = new Q[n][n];
      for (int i = 0; i < n; ++i) {
        java.util.Arrays.fill(negative[i], Q.ZERO);
        negative[i][i] = Q.NEG_ONE;
      }
      if (group().contains(negative)) {
        return true;
      }
      mGroup = null;
      return false;
    }
  }

  private static void skip(final InputStream in, long bytes) throws IOException {
    while (bytes > 0) {
      final long skipped = in.skip(bytes);
      if (skipped == 0) {
        if (in.read() == -1) {
          throw new IOException("Truncated catalogue archive");
        }
        --bytes;
      } else {
        bytes -= skipped;
      }
    }
  }

  private static String text(final byte[] a, final int offset, final int length) {
    int n = 0;
    while (n < length && a[offset + n] != 0) {
      ++n;
    }
    return new String(a, offset, n, StandardCharsets.US_ASCII).trim();
  }

  private static Candidate readMember(final byte[] a, final int order, final int n) {
    final String[] lines = new String(a, StandardCharsets.US_ASCII).lines().map(line -> line.split("%", 2)[0].trim())
      .filter(line -> !line.isEmpty()).toArray(String[]::new);
    final Matcher m = Pattern.compile("#g(\\d+)(?:f\\d+)?").matcher(lines[0]);
    if (!m.matches()) {
      throw new IllegalArgumentException("Unknown catalogue generator header");
    }
    final List<Q[][]> generators = new ArrayList<>();
    int next = 1;
    for (int k = 0; k < Integer.parseInt(m.group(1)); ++k) {
      final String type = lines[next++];
      final Q[][] result = new Q[n][n];
      if (type.equals(n + "d0") || type.equals(n + "d1")) {
        final String[] diagonal = lines[next++].split("\\s+");
        for (int i = 0; i < n; ++i) {
          java.util.Arrays.fill(result[i], Q.ZERO);
          result[i][i] = new Q(Integer.parseInt(diagonal[diagonal.length == 1 ? 0 : i]));
        }
      } else if (type.equals(Integer.toString(n))) {
        for (int i = 0; i < n; ++i) {
          final String[] row = lines[next++].split("\\s+");
          for (int j = 0; j < n; ++j) {
            result[i][j] = new Q(Integer.parseInt(row[j]));
          }
        }
      } else {
        throw new IllegalArgumentException("Unknown matrix storage: " + type);
      }
      generators.add(result);
    }
    return new Candidate(order, generators);
  }

  private static List<Candidate> readArchive(final int n) throws IOException {
    final List<Candidate> candidates = new ArrayList<>();
    final Pattern match = Pattern.compile("qcatalog/dim" + n + "/dir\\." + n
      + "(?:-\\d+)*/ordnung\\.(\\d+)/[^/]+/(?:max|min|group)\\.\\d+");
    try (InputStream resource = RationalGroupCensus.resource("a069481-carat.dat.gz");
         InputStream in = new GZIPInputStream(resource)) {
      while (true) {
        final byte[] header = in.readNBytes(512);
        if (header.length != 512) {
          throw new IOException("Truncated CARAT catalogue");
        }
        if (header[0] == 0) {
          break;
        }
        final String name = text(header, 0, 100);
        final String length = text(header, 124, 12);
        final int size = length.isEmpty() ? 0 : Integer.parseInt(length, 8);
        final Matcher m = match.matcher(name);
        if (m.matches()) {
          if (header[156] != 0 && header[156] != '0') {
            throw new IOException("Non-file candidate " + name);
          }
          candidates.add(readMember(in.readNBytes(size), Integer.parseInt(m.group(1)), n));
          skip(in, (512 - size % 512) % 512);
        } else {
          skip(in, size + (512 - size % 512) % 512);
        }
      }
    }
    return candidates;
  }

  static int maximal(final int n) throws IOException {
    final List<Candidate> candidates = readArchive(n);
    if (candidates.isEmpty()) {
      throw new IOException("No CARAT records for dimension " + n);
    }
    candidates.sort(Comparator.comparingInt((Candidate c) -> c.mOrder).reversed());
    // Adjoining the central scalar -I to a finite group is finite.
    candidates.removeIf(c -> !c.hasCentralNegation());
    final List<Candidate> unresolved = new ArrayList<>();
    for (final Candidate source : candidates) {
      boolean contained = false;
      for (final Candidate target : unresolved) {
        if (target.mOrder % source.mOrder == 0 && source.group().spectraFit(target.group())
          && RationalCoordinateWitnesses.find(source.mGenerators, target.group())) {
          contained = true;
          break;
        }
      }
      if (!contained) {
        unresolved.add(source);
      }
    }
    final List<Candidate> maximal = new ArrayList<>();
    for (final Candidate source : unresolved) {
      boolean contained = false;
      for (final Candidate target : maximal) {
        if (target.mOrder % source.mOrder == 0 && source.group().spectraFit(target.group())) {
          final boolean fits = source.mOrder <= 512
            && RationalGroupContainment.isFullSignedPermutationGroup(target.mGenerators, target.mOrder)
            ? RationalGroupContainment.hasSignedPermutationModel(source.group())
            : RationalGroupContainment.find(source.mGenerators, target.group()).isPresent();
          if (fits) {
            contained = true;
            break;
          }
        }
      }
      if (!contained) {
        maximal.add(source);
      }
    }
    return maximal.size();
  }
}
