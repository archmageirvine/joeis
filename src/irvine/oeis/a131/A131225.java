package irvine.oeis.a131;

import irvine.math.z.Z;
import irvine.oeis.triangle.BaseTriangle;

/**
 * A131225 Triangle read by rows: T(n,k) = 2*k - (1 + (-1)^(n-k))/2 (1 &lt;= k &lt;= n).
 * @author Georg Fischer
 */
public class A131225 extends BaseTriangle {

  /** Construct the sequence. */
  public A131225() {
    super(1, 1, 1);
    hasRAM(true);
  }

  @Override
  public Z triangleElement(final int n, final int k) {
    return Z.valueOf(2L * k).subtract(Z.ONE.add(Z.NEG_ONE.pow(n - k)).divide2());
  }
}
