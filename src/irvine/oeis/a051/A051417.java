package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.a025.A025547;

/**
 * A051417 Quotients of consecutive values of lcm {1, 3, 5 ...,2n-1} or A025547(n+1)/A025547(n).
 * @author Sean A. Irvine
 */
public class A051417 extends A025547 {

  private Z mA = super.next();

  @Override
  public Z next() {
    final Z t = mA;
    mA = super.next();
    return mA.divide(t);
  }
}
