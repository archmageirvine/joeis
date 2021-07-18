package irvine.oeis.a049;

import irvine.math.z.Z;
import irvine.oeis.a048.A048472;

/**
 * A049069 Array T read by antidiagonals: T(k,n) = k*n*2^(n-1) + 1, n &gt;= 0, k &gt;= 1.
 * @author Sean A. Irvine
 */
public class A049069 extends A048472 {

  @Override
  protected Z t(final int n, final int m) {
    return super.t(m, n);
  }
}
