package irvine.oeis.a057;

import irvine.math.z.Z;

/**
 * A057594 Triangle T(n,k) giving floor( (2*p mod n-1)/2), where p = period of sequence k^i (i=0,1,2,...) mod n (n &gt;= 2, 2&lt;=k&lt;=n).
 * @author Sean A. Irvine
 */
public class A057594 extends A057595 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}
