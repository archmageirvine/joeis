package irvine.oeis.a392;

import irvine.math.z.Z;
import irvine.oeis.triangle.ModifiedPascalTriangle;

/**
 * A392666 Triangle read by rows: T(n,k) (1 &lt;= k &lt;= n) given by T(n,1) = T(n,n) = 1, otherwise T(n,k) = (m*n-m*k+1)*T(n-1,k-1) + (m*k-m+1)*T(n-1,k), where m = -5.
 * @author Sean A. Irvine
 */
public class A392666 extends ModifiedPascalTriangle {

  /** Construct the sequence. */
  public A392666() {
    super(1);
  }

  @Override
  protected Z factorF(final long n, final long k) {
    return Z.valueOf(-5 * (n - k) + 1);
  }

  @Override
  protected Z factorG(final long n, final long k) {
    return Z.valueOf(-5 * k + 1);
  }
}
