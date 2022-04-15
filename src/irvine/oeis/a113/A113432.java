package irvine.oeis.a113;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a055.A055600;

/**
 * A113432 Pierpont semiprimes: semiprimes of the form (2^K)*(3^L)+1.
 * @author Georg Fischer
 */
public class A113432 extends A055600 {

  private final int mCount;

  /** Construct the sequence. */
  public A113432() {
    this(2);
  }

  /**
   * Generic constructor with parameters.
   * @param count number of prime factors
   */
  public A113432(final int count) {
    mCount = count;
  }

  @Override
  public Z next() {
    while (true) {
      final Z nz = super.next();
      if (Jaguar.factor(nz).bigOmega() == mCount) {
        return nz;
      }
    }
  }
}
