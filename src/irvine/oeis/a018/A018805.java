package irvine.oeis.a018;

import irvine.math.z.Z;
import irvine.oeis.a002.A002088;

/**
 * A018805 Number of elements in the set <code>{(x,y): 1 &lt;=</code> x,y <code>&lt;=</code> n, <code>gcd(x,y)=1}</code>.
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
