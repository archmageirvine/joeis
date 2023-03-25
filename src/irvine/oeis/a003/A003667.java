package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.a002.A002858;

/**
 * A003667 a(n) is smallest number which is uniquely of the form a(j) + a(k) with 1 &lt;= j &lt; k &lt; n and a(1) = 1, a(2) = 5.
 * @author Sean A. Irvine
 */
public class A003667 extends A002858 {

  @Override
  protected Z a2() {
    return Z.FIVE;
  }
}
