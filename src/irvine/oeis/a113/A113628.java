package irvine.oeis.a113;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A113628 Primes of the form 10 followed by a string of 1's.
 * @author Georg Fischer
 */
public class A113628 implements Sequence {

  private Z mA = Z.TEN;
  private final int mLast;

  /** Construct the sequence. */
  public A113628() {
    this(1);
  }

  /**
   * Generic constructor with parameter
   * @param last last digit
   */
  protected A113628(final int last) {
    mLast = last;
  }

  @Override
  public Z next() {
    while (true) {
      mA = mA.multiply(10).add(mLast);
      if (mA.isProbablePrime()) {
        return mA;
      }
    }
  }
}
