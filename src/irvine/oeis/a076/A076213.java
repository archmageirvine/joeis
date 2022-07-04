package irvine.oeis.a076;
// manually deris/charfun at 2022-07-01 23:08

import irvine.math.z.Z;
import irvine.oeis.a005.A005132;

/**
 * A076213 2*a(n)-1 = sign(A005132(n+1)-A005132(n)).
 * @author Georg Fischer
 */
public class A076213 extends A005132 {

  private Z mA = super.next();

  @Override
  public Z next() {
    final Z a1 = super.next();
    final Z result = Z.valueOf((a1.subtract(mA).signum() + 1) / 2);
    mA = a1;
    return result;
  }
}
