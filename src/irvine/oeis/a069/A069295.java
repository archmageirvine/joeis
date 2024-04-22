package irvine.oeis.a069;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

import irvine.math.api.Matrix;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A069295.
 * @author Sean A. Irvine
 */
public class A069295 extends Sequence2 {

  // todo this apparently is still broken for A069296 ...

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private int mN = 1;

  // We use a list to hold an entire column.
  // A non-zero value in the list indicates a 1, but different values
  // are used to represent different connected sets of bits.
  // When we update we merge connected sets as required.

  private Map<List<Byte>, Z> initial(final int rows) {
    final HashMap<List<Byte>, Z> res = new HashMap<>();
    // s loops over possible sets of 1 bits
    // We require top left bit to be a 1, hence step by 2
    for (long s = 1; s < 1L << rows; s += 2) {
      final List<Byte> lst = new ArrayList<>(rows);
      byte adj = 0;
      long t = s;
      byte p = 0;
      for (int r = 0; r < rows; ++r, t >>>= 1) {
        if ((t & 1) == 1) {
          if (p == 0) {
            p = ++adj;
          }
        } else {
          p = 0;
        }
        lst.add(p);
      }
      res.put(lst, Z.ONE);
    }
    return res;
  }

  private byte max(final List<Byte> lst) {
    byte max = 0;
    for (final byte b : lst) {
      if (b > max) {
        max = b;
      }
    }
    return max;
  }

  private void adjust(final List<Byte> lst) {
    for (int k = lst.size() - 2; k >= 0; --k) {
      final byte t = lst.get(k + 1);
      if (t != 0 && t < lst.get(k)) {
        lst.set(k, t);
      }
    }
    // Despite the construction procedure we sometimes end up with states
    // like [1,1,0,3,3], which is equivalent to [1,1,0,2,2].  This step
    // adjusts for that.
    byte r = 1;
    final byte[] map = new byte[lst.size() + 1];
    for (int k = 0; k < lst.size(); ++k) {
      final byte b = lst.get(k);
      if (b > 1) {
        if (map[b] == 0) {
          map[b] = ++r;
        }
        lst.set(k, map[b]);
      }
    }
  }

  private Map<List<Byte>, Z> update(final Map<List<Byte>, Z> left, final int rows) {
    final Map<List<Byte>, Z> res = new HashMap<>();
    for (final Map.Entry<List<Byte>, Z> e : left.entrySet()) {
      final List<Byte> state = e.getKey();
      final Z cnt = e.getValue();
      final byte max = max(state); // maximum clump used so far
      for (long s = 1; s < 1L << rows; ++s) {
        final byte[] remap = new byte[max + 1];
        remap[1] = 1;
        final List<Byte> lst = new ArrayList<>(rows);
        byte adj = 1;
        long t = s;
        byte p = 0;
        for (int r = 0; r < rows; ++r, t >>>= 1) {
          final byte u = state.get(r);
          byte l = remap[u];
          if ((t & 1) == 1) {
            if (u == 0) {
              if (p == 0) {
                p = ++adj;
              }
            } else {
              // assert u != 0;
              if (p == 0) {
                if (l != 0) {
                  p = l;
                } else {
                  // allocate next available clump code
                  p = ++adj;
                  remap[u] = p;
                }
              } else {
                // assert p != 0 && u != 0;
                if (l == 0) {
                  // allocate next available clump code
                  l = ++adj;
                  remap[u] = l;
                }
                if (l < p) {
                  p = l;
                } else {
                  remap[u] = p;
                  // Now associating u with p, replace all earlier settings
                  // todo this is possibly unnecessary but leaving until more cases are getting the right answer
                  for (int j = lst.size() - 1; j >= 0; --j) {
                    if (lst.get(j) == l) {
                      lst.set(j, p);
                    }
                  }
                }
              }
            }
          } else {
            p = 0;
          }
          lst.add(p);
        }
        adjust(lst);
        if (hasOne(lst)) {

          // debug
          if (mVerbose && state.equals(DEBUG)) {
            System.out.println(state + " -> " + lst + " with multiplicity " + cnt);
          }

          res.merge(lst, cnt, Z::add);
        }
      }
    }
    return res;
  }

  private static final List<Byte> DEBUG = Arrays.asList((byte) 2, (byte) 0, (byte) 2, (byte) 0, (byte) 1);

  private boolean hasOne(final List<Byte> lst) {
    for (final byte b : lst) {
      if (b == 1) {
        return true;
      }
    }
    return false;
  }

  protected Z count(final int rows, final int cols) {
    Map<List<Byte>, Z> state = initial(rows);
    if (mVerbose) {
      System.out.println(state);
    }
    // Now work across updating the counts
    for (int c = 1; c < cols; ++c) {
      state = update(state, rows);
      if (mVerbose) {
        System.out.println(state);
      }
    }
    Z sum = Z.ZERO;
    for (final Map.Entry<List<Byte>, Z> e : state.entrySet()) {
      sum = sum.add(e.getValue());
    }
    return sum;
  }
  
  @Override
  public Z next() {
    if (mN == 1) {
      System.out.println("5-by-5 : " + count5By5());
      System.out.println("Code:    " + count(5, 5));
    }
    ++mN;
    final Collection<List<Byte>> states = buildStates(4);
    final Matrix<Z> transitions = buildTransitionMatrix(states);
    writeMatrix(states, transitions);
    writeGraph(states, transitions);
//    final MatrixRing<Z> ring = new MatrixRing<>(states.size(), Integers.SINGLETON);
//    final Matrix<Z> pow = ring.pow(transitions, mN);
//    System.out.println("Powered matrix");
//    writeMatrix(states, pow);
//    //final Matrix<Z> t = ring.multiply(vector(states), pow);
//    final Matrix<Z> t = ring.multiply(vector(states), ring.transpose(pow));
//    //final Matrix<Z> t = ring.multiply(pow, ring.transpose(vector(states)));
//    System.out.println(t);
//    Z sum = Z.ZERO;
//    for (int k = 0; k < t.cols(); ++k) {
//      sum = sum.add(t.get(0, k));
//    }
//    System.out.println("Tsum: " + sum);
    return count(mN, 4);
  }

  private int countBlocks(final long n) {
    int cnt = 0;
    long prev = 0;
    long k = n;
    while (k != 0) {
      if ((k & 1) == 1) {
        if (prev == 0) {
          ++cnt;
        }
      }
      prev = k & 1;
      k >>>= 1;
    }
    return cnt;
  }

  private void buildStates(final Collection<List<Byte>> states, final long n, final int b, final byte max, final byte[] s, final int k, final int blk) {
    if (k == s.length) {
      // Make a copy
      final List<Byte> lst = new ArrayList<>(s.length);
      for (final byte t : s) {
        lst.add(t);
      }
      states.add(lst);
      //System.out.println("Constructed " + lst);
      return;
    }
    if ((n & (1L << k)) == 0) {
      s[k] = 0;
      buildStates(states, n, b, max, s, k + 1, blk);
    } else {
      final boolean startingNewBlock = k == 0 || (n & (1L << (k - 1))) == 0;
      final int newBlk = startingNewBlock ? blk + 1 : blk;
      if (newBlk == b) {
        s[k] = 1; // This block was chosen to be 1
        buildStates(states, n, b, max, s, k + 1, newBlk);
      } else if (startingNewBlock) {
        for (byte j = 1; j <= max; ++j) {
          s[k] = j;
          buildStates(states, n, b, (byte) Math.max(max, j + 1), s, k + 1, newBlk);
        }
      } else {
        s[k] = s[k - 1];
        buildStates(states, n, b, max, s, k + 1, newBlk);
      }
    }
  }

  private void buildStates(final Collection<List<Byte>> states, final long n, final int b, final byte[] s) {
    buildStates(states, n, b, (byte) 2, s, 0, 0);
  }

  private Collection<List<Byte>> buildStates(final int rows) {
    // Generate all patterns of {0,1}^rows
    final Collection<List<Byte>> states = new HashSet<>();
    for (long k = 1; k < 1L << rows; ++k) {
      final int blocks = countBlocks(k);
      //System.out.println("Doing " + Long.toBinaryString(k) + " with " + blocks + " blocks");
      // Choose at least one block to be "1"
      for (int b = 1; b <= blocks; ++b) {
        // Construct states with block numbers in all possible ways
        //System.out.println("Chosen block is " + b);
        buildStates(states, k, b, new byte[rows]);
      }
    }
    System.out.println(states.size() + ": " + states);
    return states;
  }

  private boolean isTransition(final List<Byte> a, final List<Byte> b) {
    // Test if a -> b is a valid transition
    if (a == b) {
      return true; // trivial
    }
    boolean saw11 = false;
    for (int k = 0; k < a.size(); ++k) {
      if (a.get(k) == 1) {
        final byte bk = b.get(k);
        if (bk > 1) {
          // 1 -> 2, 1 -> 3, etc. if not allowed
          return false;
        } else if (bk == 1) {
          // Need at least one position where 1 -> 1
          saw11 = true;
        }
      }
    }
    if (!saw11) {
      return false;
    }

    // todo the following is not right it mistakenly says 2,0,1 -> 1,0,1 is allowed
    // Deeper consistency checking
    final byte[] remap = new byte[a.size()]; // more than enough space
    remap[1] = 1;
    // Find all numbers in "a" that must become "1" in b
    // todo no! this is not right
    for (int k = 0; k < a.size(); ++k) {
      final byte ak = a.get(k);
      final byte bk = b.get(k);
      if (bk == 1 && ak > 1) {
        remap[ak] = 1;
      }
    }
    byte u = 1;
    for (int k = 0; k < a.size(); ++k) {
      final byte ak = a.get(k);
      final byte bk = b.get(k);
      if (bk >= 1) {
        // e.g., 2 -> 1
        if (ak == 1) {
          if (remap[bk] != 1) {
            return false;
          }
        } else if (ak > 1) {
          if (remap[ak] == 0) {
            remap[ak] = ++u;
          }
          if (remap[ak] != bk) {
            return false;
          }
        }
      }
    }
    
    return true;
  }

  private void buildTransitionMatrix(final Map<List<Byte>, Integer> stateMap, final Matrix<Z> m, final List<Byte> state, final int stateNumber) {
    final int rows = state.size();
    final byte max = max(state); // maximum clump used so far
    for (long s = 1; s < 1L << rows; ++s) {
      final byte[] remap = new byte[max + 1];
      remap[1] = 1;
      final List<Byte> lst = new ArrayList<>(rows);
      byte adj = 1;
      long t = s;
      byte p = 0;
      for (int r = 0; r < rows; ++r, t >>>= 1) {
        final byte u = state.get(r);
        byte l = remap[u];
        if ((t & 1) == 1) {
          if (u == 0) {
            if (p == 0) {
              p = ++adj;
            }
          } else {
            // assert u != 0;
            if (p == 0) {
              if (l != 0) {
                p = l;
              } else {
                // allocate next available clump code
                p = ++adj;
                remap[u] = p;
              }
            } else {
              // assert p != 0 && u != 0;
              if (l == 0) {
                // allocate next available clump code
                l = ++adj;
                remap[u] = l;
              }
              if (l < p) {
                p = l;
              } else {
                remap[u] = p;
                // Now associating u with p, replace all earlier settings
                // todo this is possibly unnecessary but leaving until more cases are getting the right answer
                for (int j = r - 1; j >= 0; --j) {
                  if (lst.get(j) == l) {
                    lst.set(j, p);
                  }
                }
              }
            }
          }
        } else {
          p = 0;
        }
        lst.add(p);
      }
      adjust(lst);
      if (hasOne(lst)) {
        m.set(stateNumber, stateMap.get(lst), Z.ONE);
      }
    }
  }


  private Matrix<Z> buildTransitionMatrix(final Collection<List<Byte>> states) {
    final int len = states.size();
    final Matrix<Z> m = new DefaultMatrix<>(len, len, Z.ZERO);
    final HashMap<List<Byte>, Integer> stateMap = new HashMap<>();
    int k = 0;
    for (final List<Byte> s : states) {
      stateMap.put(s, k++);
    }
    k = 0;
    for (final List<Byte> s : states) {
      buildTransitionMatrix(stateMap, m, s, k++);
    }
//    int r = 0;
//    for (final List<Byte> a : states) {
//      int c = 0;
//      for (final List<Byte> b : states) {
//        if (isTransition(a, b)) {
//          m.set(r, c, Z.ONE);
//        }
//        ++c;
//      }
//      ++r;
//    }
    return m;
  }

  private Matrix<Z> vector(final Collection<List<Byte>> states) {
    final int len = states.size();
    final Matrix<Z> vec = new DefaultMatrix<>(1, len, Z.ZERO);
    int r = 0;
    for (final List<Byte> a : states) {
      if (a.get(a.size() - 1) == 1) {
        vec.set(0, r, Z.ONE);
      }
      ++r;
    }
    return vec;
  }

  private void writeMatrix(final Collection<List<Byte>> states, final Matrix<Z> m) {
    int k = 0;
    for (final List<Byte> s : states) {
      final StringBuilder sb = new StringBuilder();
      sb.append(s).append(" -> ");
      for (int j = 0; j < m.cols(); ++j) {
        sb.append(m.get(k, j)).append(", ");
      }
      System.out.println(sb);
      ++k;
    }
  }

  private String pack(final List<Byte> lst) {
    final StringBuilder sb = new StringBuilder();
    for (final Byte b : lst) {
      sb.append(b);
    }
    return sb.toString();
  }

  private void writeGraph(final Collection<List<Byte>> states, final Matrix<Z> m) {
    System.out.println("digraph G {");
    System.out.println("node [shape=none];");
    int k = 0;
    for (final List<Byte> a : states) {
      int j = 0;
      for (final List<Byte> b : states) {
        if (k == j) {
          continue; // don't bother with the loops
        }
        if (m.get(k, j).equals(Z.ONE)) {
          if (m.get(j, k).equals(Z.ONE)) {
            if (j < k) {
              System.out.println(pack(a) + " -> " + pack(b) + " [dir=both];");
            }
          } else {
            System.out.println(pack(a) + " -> " + pack(b) + " [color=blue];");
          }
        }
        ++j;
      }
      ++k;
    }
    System.out.println("}");
  }

  private boolean is5By5(final boolean[][] mat, final boolean[][] searched, final int r, final int c) {
    if (!mat[r][c]) {
      return false;
    }
    if (c == 4) {
      return true;
    }
    searched[r][c] = true;
    if (!searched[r][c + 1] && is5By5(mat, searched, r, c + 1)) {
      return true;
    }
    if (r < 4 && !searched[r + 1][c] && is5By5(mat, searched, r + 1, c)) {
      return true;
    }
    if (r > 0 && !searched[r - 1][c] && is5By5(mat, searched, r - 1, c)) {
      return true;
    }
    if (c > 0 && !searched[r][c - 1] && is5By5(mat, searched, r, c - 1)) {
      return true;
    }
    searched[r][c] = false;
    return false;
  }

  private long count5By5() {
    long cnt = 0;
    final boolean[][] mat = new boolean[5][5];
    for (long m = 1;  m < 1L << 25; m += 2) {
      long k = m;
      for (int r = 0; r < mat.length; ++r) {
        for (int c = 0; c < mat[0].length; ++c) {
          mat[r][c] = (k & 1) == 1;
          k >>>= 1;
        }
      }
      if (is5By5(mat, new boolean[5][5], 0, 0)) {
        //System.out.println("Yes: " + Arrays.deepToString(mat).replace("true", "1").replace("false", "0"));
        ++cnt;
      }
    }
    return cnt;
  }
}
