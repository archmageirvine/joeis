package irvine.oeis.a006;

import irvine.math.MemoryFunctionInt4;
import irvine.math.z.Z;
import irvine.oeis.MobiusTransformSequence;
import irvine.oeis.Sequence;

/**
 * A006207 Generalized Fibonacci numbers A_{n,2}.
 * @author Sean A. Irvine
 */
public class A006207 extends MobiusTransformSequence {

  /**
   * A sequence forming the basis for some generalized Fibonacci numbers.
   */
  public static class PhinSequence extends MemoryFunctionInt4<Z> implements Sequence {

    private int mN;
    private int mM = 0;

    /**
     * Construct the sequence.
     * @param n parameter
     */
    public PhinSequence(final int n) {
      mN = n;
    }

    @Override
    protected Z compute(final int k, final int i, final int j, final int n) {
      if (k == 1) {
        if (i == 1) {
          return Z.ZERO;
        } else if (i == 2) {
          return Z.ONE;
        } else {
          if (j == n) {
            return get(1, i - 2, 1, n).add(get(1, i - 1, n, n));
          }
          return get(1, i - 2, 1, n).add(get(1, i - 2, j + 1, n));
        }
      } else if (k == 2) {
        if (i <= 2) {
          return j == n ? Z.ONE : Z.ZERO;
        } else {
          if (j == n) {
            return get(2, i - 2, 1, n).add(get(2, i - 1, n, n));
          }
          return get(2, i - 2, 1, n).add(get(2, i - 2, j + 1, n));

        }
      }
      throw new UnsupportedOperationException();
    }

    @Override
    public Z next() {
      ++mM;
      Z sum = Z.ZERO;
      for (int j = 1; j <= mN; ++j) {
        final int t = mM + 2 - 2 * j;
        if (t > 0) {
          sum = sum.add(get(1, t, j, mN));
        }
      }
      return sum.multiply2().add(get(2, mM, mN, mN));
    }
  }

  /** Construct the sequence. */
  public A006207() {
    super(new PhinSequence(2), 0);
    super.next();
  }

  private int mN = 0;

  @Override
  public Z next() {
    return super.next().divide(++mN);
  }
}
