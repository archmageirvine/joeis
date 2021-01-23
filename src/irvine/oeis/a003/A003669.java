package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.a002.A002858;

/**
 * A003669 a(n) is smallest number which is uniquely a(j) + a(k), j &lt; k.
 * @author Sean A. Irvine
 */
public class A003669 extends A002858 {

  @Override
  protected Z a1() {
    return Z.THREE;
  }

  @Override
  protected Z a2() {
    return Z.FOUR;
  }
}
