package irvine.oeis.a069;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import irvine.math.MemoryFunction;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A069295 Number of n X 4 binary arrays with a path of adjacent 1's from upper left corner to anywhere in right hand column.
 * @author Sean A. Irvine
 */
public class A069295 extends AbstractSequence {

  static final class State {
    private final byte[] mState;

    State(final byte[] state) {
      mState = state;
    }

    int size() {
      return mState.length;
    }

    byte get(final int k) {
      return mState[k];
    }

    private boolean has(final byte v) {
      for (final byte b : mState) {
        if (b == v) {
          return true;
        }
      }
      return false;
    }

    boolean has1() {
      return has((byte) 1);
    }

    @Override
    public int hashCode() {
      return Arrays.hashCode(mState);
    }

    @Override
    public boolean equals(final Object obj) {
      return obj instanceof State && Arrays.equals(((State) obj).mState, mState);
    }

    @Override
    public String toString() {
      final StringBuilder sb = new StringBuilder();
      for (final byte b : mState) {
        sb.append(b);
      }
      return sb.toString();
    }
  }

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private int mN = 1;
  private int mPrevRows = 0;
  private int mPrevCols = 0;
  private Map<State, Z> mStates = null;

  protected A069295(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A069295() {
    this(2);
  }

  private final MemoryFunction<State, List<State>> mTransitions = new MemoryFunction<>() {

    @Override
    protected List<State> compute(final State state) {
      final List<State> states = new ArrayList<>();
      final int rows = state.size();
      final int rs = Math.max(2, rows);
      for (long s = 1; s < 1L << rows; ++s) {
        final byte[] remap = new byte[rs];
        remap[1] = 1;
        final byte[] lst = new byte[rows];
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
                  // Now associating l with p, replace all earlier settings
                  remap[u] = l;
                  for (int j = r - 1; j >= 0; --j) {
                    if (lst[j] == p) {
                      lst[j] = l;
                    }
                  }
                  p = l;
                } else {
                  remap[u] = p;
                }
              }
            }
          } else {
            p = 0;
          }
          lst[r] = p;
        }
        adjust(lst);
        final State st = new State(lst);
        if (st.has1()) {
          states.add(st);
        }
      }
      return states;
    }
  };

  // We use a list to hold an entire column.
  // A non-zero value in the list indicates a 1, but different values
  // are used to represent different connected sets of bits.
  // When we update we merge connected sets as required.

  protected Map<State, Z> initial(final int rows) {
    final HashMap<State, Z> res = new HashMap<>();
    // s loops over possible sets of 1 bits
    // We require top left bit to be a 1, hence step by 2
    for (long s = 1; s < 1L << rows; s += 2) {
      final byte[] lst = new byte[rows];
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
        lst[r] = p;
      }
      res.put(new State(lst), Z.ONE);
    }
    return res;
  }

  private void adjust(final byte[] lst) {
    for (int k = lst.length - 2; k >= 0; --k) {
      final byte t = lst[k + 1];
      if (t != 0 && t < lst[k]) {
        lst[k] = t;
      }
    }
    // Despite the construction procedure we sometimes end up with states
    // like [1,1,0,3,3], which is equivalent to [1,1,0,2,2].  This step
    // adjusts for that, converting them both to [1,1,0,2,2].
    byte r = 1;
    final byte[] map = new byte[lst.length + 1];
    for (int k = 0; k < lst.length; ++k) {
      final byte b = lst[k];
      if (b > 1) {
        if (map[b] == 0) {
          map[b] = ++r;
        }
        lst[k] = map[b];
      }
    }
  }

  private Map<State, Z> update(final Map<State, Z> left) {
    final Map<State, Z> res = new HashMap<>();
    for (final Map.Entry<State, Z> e : left.entrySet()) {
      final State state = e.getKey();
      final Z cnt = e.getValue();
      for (final State st : mTransitions.getValue(state)) {
        res.merge(st, cnt, Z::add);
      }
    }
    return res;
  }

  protected Z getResult(final Map<State, Z> states) {
    Z sum = Z.ZERO;
    for (final Z v : states.values()) {
      sum = sum.add(v);
    }
    return sum;
  }

  protected Z count(final int rows, final int cols) {
    if (rows != mPrevRows) {
      // Reclaim space when we are working in a different size
      mTransitions.clear();
      mPrevRows = rows;
      mStates = null;
    }
    if (mStates == null) {
      mStates = initial(rows);
      mPrevCols = 1;
      if (mVerbose) {
        System.out.println(mStates);
      }
    }
    // Now work across updating the counts
    while (mPrevCols < cols) {
      mStates = update(mStates);
      ++mPrevCols;
      if (mVerbose) {
        System.out.println("col=" + mPrevCols + ": " + mStates);
      }
    }
    return getResult(mStates);
  }
  
  @Override
  public Z next() {
    return count(++mN, 4);
  }

//  private boolean isAdjacent1(final boolean[][] mat, final boolean[][] searched, final int r, final int c) {
//    if (!mat[r][c]) {
//      return false;
//    }
//    if (c == mat[0].length - 1) {
//      return true;
//    }
//    searched[r][c] = true;
//    if (!searched[r][c + 1] && isAdjacent1(mat, searched, r, c + 1)) {
//      return true;
//    }
//    if (r < mat.length - 1 && !searched[r + 1][c] && isAdjacent1(mat, searched, r + 1, c)) {
//      return true;
//    }
//    if (r > 0 && !searched[r - 1][c] && isAdjacent1(mat, searched, r - 1, c)) {
//      return true;
//    }
//    if (c > 0 && !searched[r][c - 1] && isAdjacent1(mat, searched, r, c - 1)) {
//      return true;
//    }
//    searched[r][c] = false;
//    return false;
//  }
//
//  // This explicit computation verifies Hardin value is correct in small cases
//  private long countByBruteForce(final int rows, final int cols) {
//    long cnt = 0;
//    final long[] byTypeCount = new long[1 << rows];
//    final boolean[][] mat = new boolean[rows][cols];
//    for (long m = 1; m < 1L << (rows * cols); m += 2) {
//      long k = m;
//      for (int r = 0; r < mat.length; ++r) {
//        for (int c = 0; c < mat[0].length; ++c) {
//          mat[r][c] = (k & 1) == 1;
//          k >>>= 1;
//        }
//      }
//      if (isAdjacent1(mat, new boolean[rows][cols], 0, 0)) {
//        ++cnt;
//        int v = 0;
//        for (int h = 0; h < rows; ++h) {
//          v *= 2;
//          if (mat[h][cols - 1]) {
//            v += 1;
//          }
//        }
//        ++byTypeCount[v];
//      }
//    }
//    for (int k = 0; k < byTypeCount.length; ++k) {
//      System.out.println(Long.toBinaryString(k) + " : " + byTypeCount[k]);
//    }
//    return cnt;
//  }
}
