package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.triangle.UpperLeftTriangle;

/**
 * A057075 Table read by antidiagonals of T(n,k)=floor[n^n/k] with n,k &gt;= 1.
 * @author Georg Fischer
 */
public class A057075 extends UpperLeftTriangle {

  /** Construct the sequence. */
  public A057075() {
    super(1, 1, -1);
  }

  @Override
  public Z matrixElement(final int n, final int k) {
    return Z.valueOf(n).pow(n).divide(k);
  }
}
