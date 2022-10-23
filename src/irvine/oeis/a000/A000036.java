package irvine.oeis.a000;

import irvine.math.Hypersphere;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A000036 Let A(n) = #{(i,j): i^2 + j^2 &lt;= n}, V(n) = Pi*n, P(n) = A(n) - V(n); A000099 gives values of n where |P(n)| sets a new record; sequence gives closest integer to P(A000099(n)).
 * @author Sean A. Irvine
 */
public class A000036 extends Sequence1 {

  private int mN = 0;
  private double mBiggestDeviation = 0;

  @Override
  public Z next() {
    while (true) {
      final Z c = Hypersphere.countPoints(2, ++mN);
      final double dev = c.doubleValue() - Math.PI * mN;
      final double adev = Math.abs(dev);
      if (adev > mBiggestDeviation) {
        mBiggestDeviation = adev;
        return Z.valueOf(Math.round(dev));
      }
    }
  }
}

