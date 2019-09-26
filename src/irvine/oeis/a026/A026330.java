package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026330 <code>a(n) =</code> number of <code>(s(0), s(1)</code>, ..., <code>s(n))</code> such that <code>s(i)</code> is a nonnegative integer and <code>|s(i) - s(i-1)| &lt;= 1</code> for i <code>= 1,2,...,n, s(0) = 2, s(2n) =n+1</code>. Also <code>a(n) = T(2n,n+1)</code>, where T is the array in <code>A026323</code>.
 * @author Sean A. Irvine
 */
public class A026330 extends A026323 {

  private long mN = -1;

  @Override
  public Z next() {
    return get(2 * ++mN, mN + 1);
  }
}
