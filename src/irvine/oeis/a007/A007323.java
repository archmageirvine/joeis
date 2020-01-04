package irvine.oeis.a007;

import java.util.Arrays;
import java.util.Stack;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007323.
 * @author Sean A. Irvine
 */
public class A007323 implements Sequence {

  // DFS after Fromentin and Hivert.
  // Fromentin and Hivert give a high-performance C++ implementation
  // at https://github.com/jfromentin/nsgtree

  private static final class Semigroup {
    private int mGenus;
    private int mConductor;
    private int mMin;
    private int[] mDecomposition;

    @Override
    public String toString() {
      return "g=" + mGenus + " c=" + mConductor + " m=" + mMin + " d=" + Arrays.toString(mDecomposition);
    }
  }

  private int mN = -1;

  private Semigroup root(final int genus) {
    final Semigroup root = new Semigroup();
    root.mConductor = 1;
    root.mGenus = 0;
    root.mMin = 1;
    root.mDecomposition = new int[3 * genus + 1];
    for (int x = 0; x < root.mDecomposition.length; ++x) {
      root.mDecomposition[x] = 1 + x / 2;
    }
    return root;
  }

  private Semigroup son(final Semigroup s, final int x, final int g) {
    //System.out.println("s=" + s);
    assert s.mDecomposition[x] == 1;
    final Semigroup son = new Semigroup();
    son.mConductor = x + 1;
    son.mGenus = s.mGenus + 1;
    // todo sai next two options equivalent according to C++
    son.mMin = x > s.mMin ? s.mMin : s.mMin + 1;
    //son.mMin = x == s.mMin ? son.mConductor : s.mMin;
    son.mDecomposition = Arrays.copyOf(s.mDecomposition, s.mDecomposition.length);
    for (int y = x; y < s.mDecomposition.length; ++y) {
      if (s.mDecomposition[y - x] > 0) {
        --son.mDecomposition[y];
        //son.mDecomposition[y] = s.mDecomposition[y] - 1;
      }
    }
    // todo sai the following condition should be true cf. c++
    //System.out.println(son);
//    assert son.mDecomposition[son.mConductor - 1] == 0 : son;
    return son;
  }

  @Override
  public Z next() {
    final long[] counts = new long[++mN + 1]; // probably only need to count genus mN
    Stack<Semigroup> stack = new Stack<>();
    stack.push(root(mN));
    while (!stack.isEmpty()) {
      final Semigroup s = stack.pop();
      ++counts[s.mGenus];
      if (s.mGenus < mN) {
        for (int x = s.mConductor; x <= s.mConductor + s.mMin; ++x) {
          if (s.mDecomposition[x] == 1) {
            stack.push(son(s, x, mN));
          }
        }
      }
    }
    //System.out.println(Arrays.toString(counts));
    return Z.valueOf(counts[mN]);
  }
}
