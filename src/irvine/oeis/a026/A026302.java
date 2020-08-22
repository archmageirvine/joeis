package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026302 a(n) = number of (s(0), s(1), ..., s(n)) such that s(i) is a nonnegative integer and |s(i) - s(i-1)| &lt;= 1 for i = 1,2,...,n, s(0) = 0, s(2n) = n. Also a(n) = T(2n,n), where T is the array in A026300.
 * @author Sean A. Irvine
 */
public class A026302 extends A026300 {

  private long mN = -1;

  @Override
  public Z next() {
    return t(2 * ++mN, mN);
  }
}
