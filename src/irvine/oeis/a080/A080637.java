package irvine.oeis.a080;

import irvine.math.z.Z;
import irvine.oeis.a007.A007378;

/**
 * A080637 <code>a(n)</code> is smallest positive integer which is consistent with sequence being monotonically increasing and satisfying <code>a(1)=2, a(a(n)) = 2n+1</code> for <code>n&gt;1</code>.
 * @author Sean A. Irvine
 */
public class A080637 extends A007378 {

  @Override
  public Z next() {
    return super.next().subtract(1);
  }
}
