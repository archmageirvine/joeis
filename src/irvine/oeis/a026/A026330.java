package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026330 a(n) = number of (s(0), s(1), ..., s(n)) such that s(i) is a nonnegative integer and |s(i) - s(i-1)| &lt;= 1 for i = 1,2,...,n, s(0) = 2, s(2n) = n+1. Also a(n) = T(2n,n+1), where T is the array in A026323.
 * @author Sean A. Irvine
 */
public class A026330 extends A026323 {

  /** Construct the sequence. */
  public A026330() {
    super(0);
  }

  private long mN = -1;

  @Override
  public Z next() {
    return get(2 * ++mN, mN + 1);
  }
}
