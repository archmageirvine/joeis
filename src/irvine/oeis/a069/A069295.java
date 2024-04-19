package irvine.oeis.a069;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    return count(++mN, 4);
  }
}
