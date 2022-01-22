package irvine.oeis.a201;

import irvine.math.z.Z;
import irvine.oeis.a054.A054240;
import irvine.oeis.triangle.Triangle;

/**
 * A201651 Bit-interleaved number addition table (cf. A054240) as triangle read by rows: T(n,k) = n and k added in binary representation, where carries shift 2 instead of 1, 0 &lt;= k &lt;= n.
 * T(n,k) = n and k added in binary representation, where carries shift 2 instead of 1, 0 &lt;= k &lt;= n.
 * @author Georg Fischer
 */
public class A201651 extends Triangle {

  /** Construct the sequence. */
  public A201651() {
    super(0);
  }

  @Override
  public Z compute(final int n, final int k) {
    return Z.valueOf(A054240.baseSqrt2Add(n, k));
  }
}
