package irvine.oeis.a022;

import irvine.math.z.Z;
import irvine.oeis.a003.A003586;

/**
 * A022328 Exponent of 2 (value of i) in n-th number of form 2^i*3^j, i &gt;= 0, j &gt;= 0 (see A003586).
 * @author Sean A. Irvine
 */
public class A022328 extends A003586 {

  @Override
  public Z next() {
    final Z t = super.next();
    t.makeOdd();
    return Z.valueOf(t.auxiliary());
  }
}
