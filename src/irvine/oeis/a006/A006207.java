package irvine.oeis.a006;

import irvine.math.MemoryFunction4;
import irvine.math.z.Z;
import irvine.oeis.MobiusTransformSequence;
import irvine.oeis.Sequence;

/**
 * A006207 Generalized Fibonacci numbers <code>A_{n,2}</code>.
 * @author Sean A. Irvine
 */
public class A006207 extends MobiusTransformSequence {

  /**
   * A sequence forming the basis for some generalized Fibonacci numbers.
   */
  public static class PhinSequence extends MemoryFunction4<Integer, Z> implements Sequence {

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
    protected Z compute(final Integer k, final Integer i, final Integer j, final Integer n) {
      if (k == 1) {
        if (i == 1) {
          return Z.ZERO;
        } else if (i == 2) {
          return Z.ONE;
        } else {
          if (j.equals(n)) {
            return get(1, i - 2, 1, n).add(get(1, i - 1, n, n));
          }
          return get(1, i - 2, 1, n).add(get(1, i - 2, j + 1, n));
        }
      } else if (k == 2) {
        if (i <= 2) {
          return j.equals(n) ? Z.ONE : Z.ZERO;
        } else {
          if (j.equals(n)) {
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
