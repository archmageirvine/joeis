package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A001628 Convolved Fibonacci numbers.
 * @author Sean A. Irvine
 */
public class A001628 extends A000045 {

  {
    super.next();
  }

  private Z mA = super.next();
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    final Z f = super.next();
    final Z t = mA.multiply(mN + 1).multiply(5 * mN + 12)
      .add(f.multiply(mN).multiply(5 * mN + 11));
    mA = f;
    return t.divide(50);
  }
}
