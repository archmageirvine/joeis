package irvine.oeis.a002;

import irvine.math.z.Z;

/**
 * A002859 <code>a(1) = 1, a(2) = 3</code>; for <code>n &gt;= 3, a(n)</code> is smallest number that is uniquely of the form <code>a(j) + a(k)</code> with <code>1 &lt;= j &lt; k &lt; n</code>.
 * @author Sean A. Irvine
 */
public class A002859 extends A002858 {

  protected Z a2() {
    return Z.THREE;
  }
}
