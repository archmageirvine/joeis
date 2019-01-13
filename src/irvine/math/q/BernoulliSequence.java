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

  /**
   * Construct the Bernoulli sequence skipping specified initial terms.
   * @param skip number of terms to be skipped
   */
  public BernoulliSequence(final long skip) {
    for (long k = 0; k < skip; ++k) {
      next();
    }
  }

  @Override
  public final Q next() {
    if (++mN == 0) {
      mB.set(0, Q.ONE);
      return Q.ONE;
    }
    Q s = Q.ZERO;
    for (long k = 0; k < mN; ++k) {
      s = s.add(mB.get(k).multiply(Binomial.binomial(mN + 1, k)));
    }
    s = s.divide(-mN - 1);
    mB.set(mN, s);
    return s;
  }

  /**
   * Get the nth term of the Bernoulli sequence.
   * @param n term number
   * @return term value
   */
  public Q get(final long n) {
    while (mB.length() <= n) {
      next();
    }
    return mB.get(n);
  }

  /**
   * Print the Bernoulli sequence.
   * @param args ignored
   */
  public static void main(final String[] args) {
    final BernoulliSequence seq = new BernoulliSequence(0);
    while (true) {
      final Q b = seq.next();
      if (b == null) {
        break;
      }
      System.out.println(b.toString());
    }
  }
}

