package irvine.oeis.a000;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A000413 Let A(n) = #{(i,j,k): i^2 + j^2 + k^2 &lt;= n}, V(n) = (4/3)*Pi*n^(3/2), P(n) = A(n) - V(n); A000092 gives values of n where |P(n)| sets a new record; sequence gives A(A000092(n)).
 * @author Sean A. Irvine
 */
public class A000413 extends Sequence0 {

  private int mN = -1;
  private double mDeviation = 0;

  private double v(final long n) {
    return Math.PI * 1.33333333333333333333333333333333333 * Math.pow(n, 1.5);
  }

  @Override
  public Z next() {
    while (true) {
      final long n = ++mN;
      final Z c = Functions.HYPERSPHERE_POINTS.z(3, n);
      final double dev = Math.abs(c.doubleValue() - v(mN));
      if (dev > mDeviation) {
        mDeviation = dev;
        return c;
      }
    }
  }
}

