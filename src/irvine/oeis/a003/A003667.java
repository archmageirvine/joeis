package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.a002.A002858;

/**
 * A003667 <code>a(n)</code> is smallest number which is uniquely of the form <code>a(j)+a(k)</code> with <code>1&lt;=j&lt;k&lt;n</code>.
 * @author Sean A. Irvine
 */
public class A003667 extends A002858 {

  @Override
  protected Z a2() {
    return Z.FIVE;
  }
}
