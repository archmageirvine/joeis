package irvine.math.q;

import irvine.math.api.RationalSequence;
import irvine.math.z.Binomial;
import irvine.util.array.LongDynamicArray;

/**
 * Generate terms of the Bernoulli sequence.
 *
 * @author Sean A. Irvine
 */
public class BernoulliSequence implements RationalSequence {

  private long mN = -1;
  private final LongDynamicArray<Q> mB = new LongDynamicArray<>();
  {
    mB.set(0, Q.ONE);
    mB.set(1, new Q(-1, 2)); // only non-zero odd term
  }

  /**
   * Construct the Bernoulli sequence skipping specified initial terms.
   * @param skip number of terms to be skipped
   */
  public BernoulliSequence(final long skip) {
    for (long k = 0; k < skip; ++k) {
      nextQ();
    }
  }

  @Override
  public final Q nextQ() {
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

  /**
   * Get the nth term of the Bernoulli sequence.
   * @param n term number
   * @return term value
   */
  public Q get(final long n) {
    while (mB.length() <= n) {
      nextQ();
    }
    return mB.get(n);
  }

  /**
   * Print the Bernoulli sequence.
   * @param args ignored
   */
  public static void main(final String[] args) {
    final BernoulliSequence seq = new BernoulliSequence(0);
    while (!System.out.checkError()) {
      final Q b = seq.nextQ();
      if (b == null) {
        break;
      }
      System.out.println(b);
    }
  }
}

