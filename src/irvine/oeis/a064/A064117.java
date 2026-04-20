package irvine.oeis.a064;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A064117 Primes formed by the initial digits of the decimal expansion of the golden ratio phi = (1+sqrt(5))/2.
 * @author Sean A. Irvine
 */
public class A064117 extends AbstractSequence {

  private long mN;
  private CR mFraction;
  private Z mT;

  /** Construct the sequence. */
  public A064117() {
    this(0, CR.PHI);
  }

  /**
   * Generic constructor with parameters
   * @param offset
   * @param fraction
   */
  public A064117(final int offset, final CR fraction) {
    super(offset);
    mFraction = fraction;
    mT = Z.ONE;
  }

  @Override
  public Z next() {
    while (true) {
      mT = mT.multiply(10);
      final Z t = mFraction.multiply(mT).floor();
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}
