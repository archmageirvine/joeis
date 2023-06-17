package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A007661 Triple factorial numbers a(n) = n!!!, defined by a(n) = n*a(n-3), a(0) = a(1) = 1, a(2) = 2. Sometimes written n!3.
 * @author Sean A. Irvine
 */
public class A007661 extends AbstractSequence {

  /* Construct the sequence. */
  public A007661() {
    super(0);
  }

  private Z mA = Z.ONE;
  private Z mB = Z.ONE;
  private Z mC = Z.TWO;
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN < 2) {
      return Z.ONE;
    } else if (mN > 2) {
      final Z t = mA.multiply(mN);
      mA = mB;
      mB = mC;
      mC = t;
    }
    return mC;
  }
}
