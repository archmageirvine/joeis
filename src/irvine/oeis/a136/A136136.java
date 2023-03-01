package irvine.oeis.a136;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A136136 a(n+1)=sopfr(2a(n)+1), with sopfr=A001414. Finishes with 10 (fixed point).
 * @author Georg Fischer
 */
public class A136136 extends Sequence1 {

  private final int mC;
  private Z mA;

  /** Construct the sequence. */
  public A136136() {
    this(2);
  }

  /**
   * Generic constructor with parameters
   * @param c constant factor for previous term
   */
  public A136136(final int c) {
    mC = c;
    mA = Z.ONE;
  }

  @Override
  public Z next() {
    final Z result = mA;
    if (mA != null) {
      mA = Jaguar.factor(mA.multiply(mC).add(1)).sopfr();
      if (mA.equals(result)) {
        mA = null;
      }
    }
    return result;
  }
}
