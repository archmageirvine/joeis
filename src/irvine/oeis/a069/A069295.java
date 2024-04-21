package irvine.oeis.a069;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

import irvine.math.api.Matrix;
import irvine.math.group.MatrixRing;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.z.Integers;
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
    final Collection<List<Byte>> states = buildStates(mN);
    final Matrix<Z> transitions = buildTransitionMatrix(states);
    writeMatrix(states, transitions);
    final MatrixRing<Z> ring = new MatrixRing<>(states.size(), Integers.SINGLETON);
    final Matrix<Z> t = ring.multiply(vector(states), ring.pow(transitions, 4));
    System.out.println(t);
    return count(++mN, 4);
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
          if(remap[bk] != 1) {
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

  private Matrix<Z> buildTransitionMatrix(final Collection<List<Byte>> states) {
    final int len = states.size();
    final Matrix<Z> m = new DefaultMatrix<>(len, len, Z.ZERO);
    int r = 0;
    for (final List<Byte> a : states) {
      int c = 0;
      for (final List<Byte> b : states) {
        if (isTransition(a, b)) {
          m.set(r, c, Z.ONE);
        }
        ++c;
      }
      ++r;
    }
    return m;
  }

  private Matrix<Z> vector(final Collection<List<Byte>> states) {
    final int len = states.size();
    final Matrix<Z> vec = new DefaultMatrix<>(1, len, Z.ZERO);
    int r = 0;
    for (final List<Byte> a : states) {
      if (a.get(0) == 1) {
        vec.set(0, r, Z.ONE);
      }
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
}
