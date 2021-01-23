package irvine.oeis.a079;

import irvine.math.z.Z;
import irvine.oeis.a007.A007378;

/**
 * A079905 a(1)=1; then a(n) is smallest positive integer which is consistent with sequence being monotonically increasing and satisfying a(a(n)) = 2n+1 for n&gt;1.
 * @author Sean A. Irvine
 */
public class A079905 extends A007378 {

  @Override
  public Z next() {
    return super.next().subtract(size() == 1 ? 2 : 1);
  }
}
