package irvine.oeis.a002;

import irvine.math.z.Z;

/**
 * A002859 a(1) = 1, a(2) = 3; for n &gt;= 3, a(n) is smallest number that is uniquely of the form a(j) + a(k) with 1 &lt;= j &lt; k &lt; n.
 * @author Sean A. Irvine
 */
public class A002859 extends A002858 {

  @Override
  protected Z a2() {
    return Z.THREE;
  }
}
