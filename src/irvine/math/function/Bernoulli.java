package irvine.math.function;

import irvine.math.q.Q;
import irvine.math.z.Binomial;
import irvine.util.array.LongDynamicArray;

/**
 * Bernoulli numbers.
 * @author Sean A. Irvine
 */
public class Bernoulli extends AbstractFunctionQ1 {

  private long mN = -1;
  private final LongDynamicArray<Q> mB = new LongDynamicArray<>();
  {
    mB.set(0, Q.ONE);
    mB.set(1, new Q(-1, 2)); // only non-zero odd term
  }

  private Q nextQ() {
    if (++mN >= mB.length()) {
      if ((mN & 1) == 1) {
        mB.set(mN, Q.ZERO);
      } else {
        Q s = new Q(-mN - 1, 2); // Contribution from B(1)
        for (long k = 0; k < mN; k += 2) {
          s = s.add(mB.get(k).multiply(Binomial.binomial(mN + 1, k)));
        }
        s = s.divide(-mN - 1);
        mB.set(mN, s);
      }
    }
    return mB.get(mN);
  }

  @Override
  public Q q(final long n) {
    while (mB.length() <= n) {
      nextQ();
    }
    return mB.get(n);
  }
}

