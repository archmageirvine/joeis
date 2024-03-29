package irvine.oeis.a257;
// Generated by gen_seq4.pl A257606/modpas2 at 2021-11-12 23:51

import irvine.math.z.Z;
import irvine.oeis.triangle.ModifiedPascalTriangle;

/**
 * A257619 Triangle read by rows: T(n,k) = t(n-k, k); t(n,m) = f(m)*t(n-1,m) + f(n)*t(n,m-1), where f(x) = 9*x + 2.
 * @author Georg Fischer
 */
public class A257619 extends ModifiedPascalTriangle {

  @Override
  protected Z factorF(final long n, final long k) {
    return Z.valueOf(9 * (n - k) + 2);
  }

  @Override
  protected Z factorG(final long n, final long k) {
    return Z.valueOf(9 * k + 2);
  }

}
