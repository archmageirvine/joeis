package irvine.oeis.a006;

import irvine.math.MemoryFunctionInt4;
import irvine.math.z.Z;
import irvine.oeis.transform.Phi2TransformSequence;
import irvine.oeis.Sequence;

/**
 * A006210 Generalized Fibonacci numbers D_{n,2}.
 * @author Sean A. Irvine
 */
public class A006210 extends Phi2TransformSequence {

  /**
   * A sequence forming the basis for some generalized Fibonacci numbers.
   */
  public static class PsinSequence extends MemoryFunctionInt4<Z> implements Sequence {

    private int mN;
    private int mM = 0;

    /**
     * Construct the sequence.
     * @param n parameter
     */
    public PsinSequence(final int n) {
      mN = n;
    }

    @Override
    protected Z compute(final int k, final int i, final int j, final int n) {
      assert Math.abs(j) <= n;
      if (k == 1) {
        if (i == 1) {
          return j == n ? Z.ONE : Z.ZERO;
        } else if (i == 2) {
          return j == 1 ? Z.ONE : Z.ZERO;
        }
      } else if (i == 1 || i == 2) {
        if (j == 1) {
          return get(k - 1, i, 1, n).add(get(k - 1, i, -n, n)).add(get(k - 1, i, n, n));
        } else if (j > 1) {
          return get(k - 1, i, j - 1, n).add(get(k - 1, i, n, n));
        } else if (j == -1) {
          return get(k - 1, i, -1, n).add(get(k - 1, i, -n, n)).add(get(k - 1, i, n, n));
        } else if (j < -1) {
          return get(k - 1, i, j + 1, n).add(get(k - 1, i, -n, n));
        }
      }
      throw new UnsupportedOperationException();
    }

    @Override
    public Z next() {
      ++mM;
      Z sum = Z.ZERO;
      for (int k = 1; k < mN; ++k) {
        sum = sum.add(get(mM + 2 - k, 1, k - mN - 1, mN));
      }
      sum = sum.add(get(mM + 1, 2, -1, mN));
      return sum.multiply2().add(1);
    }

  }

  /** Construct the sequence. */
  public A006210() {
    super(new PsinSequence(2), 0);
    super.next();
  }

  private int mN = 0;

  @Override
  public Z next() {
    return super.next().divide(2L * ++mN);
  }
}
