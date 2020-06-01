package irvine.oeis.a079;

import irvine.math.z.Z;
import irvine.oeis.a007.A007378;

/**
 * A079905 <code>a(1)=1;</code> then <code>a(n)</code> is smallest positive integer which is consistent with sequence being monotonically increasing and satisfying <code>a(a(n)) = 2n+1</code> for <code>n&gt;1</code>.
 * @author Sean A. Irvine
 */
public class A079905 extends A007378 {

  @Override
  public Z next() {
    return super.next().subtract(size() == 1 ? 2 : 1);
  }
}
