package irvine.oeis.a084;

import irvine.math.z.Z;
import irvine.oeis.a054.A054905;

/**
 * A084293 a(n) = 2n + A054905(n).
 * @author Sean A. Irvine
 */
public class A084293 extends A054905 {

  @Override
  public Z next() {
    return super.next().add(mN);
  }
}
