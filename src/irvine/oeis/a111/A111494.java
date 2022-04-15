package irvine.oeis.a111;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.a107.A107665;

/**
 * A111494 3-almost primes with semiprime digits (digits 4, 6, 9 only).
 * @author Georg Fischer
 */
public class A111494 extends A107665 {

  private int mCount;

  /** Construct the sequence. */
  public A111494() {
    this(3);
  }

  /**
   * Generic constructor with parameters.
   * @param count number of prime factors
   */
  public A111494(final int count) {
    mCount = count;
  }

  @Override
  public Z next() {
    while (true) {
      final Z nz = super.next();
      if (Cheetah.factor(nz).bigOmega() == mCount) {
        return nz;
      }
    }
  }
}
