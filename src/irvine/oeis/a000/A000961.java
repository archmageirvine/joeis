package irvine.oeis.a000;

/**
 * A000961 Powers of primes. Alternatively, 1 and the prime powers <code>(p^k</code>, p prime, k <code>&gt;= 1)</code>.
 * @author Sean A. Irvine
 */
public class A000961 extends A000015 {

  private long mPrev = 0;

  /**
   * Return the next number of this sequence as a long.
   * @return next number
   */
  @Override
  public long nextLong() {
    while (true) {
      final long t = super.nextLong();
      if (t != mPrev) {
        mPrev = t;
        return t;
      }
    }
  }
}

