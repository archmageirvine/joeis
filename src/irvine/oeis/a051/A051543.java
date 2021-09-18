package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.a025.A025555;

/**
 * A051543 Quotients of consecutive values of lcm of first n triangular numbers (A000217).
 * @author Sean A. Irvine
 */
public class A051543 extends A025555 {

  private Z mA = super.next();

  @Override
  public Z next() {
    final Z t = mA;
    mA = super.next();
    return mA.divide(t);
  }
}
