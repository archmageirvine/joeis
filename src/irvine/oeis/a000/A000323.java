package irvine.oeis.a000;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A000323 Let A(n) = #{(i,j): i^2 + j^2 &lt;= n}, V(n) = Pi*n, P(n) = A(n) - V(n); A000099 gives values of n where |P(n)| sets a new record; sequence gives A(A000099(n)).
 * @author Sean A. Irvine
 */
public class A000323 extends Sequence1 {

  private int mN = 0;
  private double mDeviation = 0;

  @Override
  public Z next() {
    while (true) {
      final Z c = Functions.HYPERSPHERE_POINTS.z(2, ++mN);
      final double dev = Math.abs(c.doubleValue() - Math.PI * mN);
      if (dev > mDeviation) {
        mDeviation = dev;
        return c;
      }
    }
  }
}

