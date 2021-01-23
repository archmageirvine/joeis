package irvine.oeis.a018;

import irvine.math.z.Z;
import irvine.oeis.a002.A002088;

/**
 * A018805 Number of elements in the set {(x,y): 1 &lt;= x,y &lt;= n, gcd(x,y)=1}.
 * @author Sean A. Irvine
 */
public class A018805 extends A002088 {

  {
    next(); // skip 0th
  }

  @Override
  public Z next() {
    return super.next().multiply2().subtract(1);
  }
}
