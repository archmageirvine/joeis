package irvine.oeis.a000;

import irvine.math.Hypersphere;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000036 Let <code>A(n) = #{(i,j)</code>: <code>i^2 + j^2 &lt;= n}, V(n) =</code> Pi*n, <code>P(n) = A(n) - V(n)</code>; A000099 gives values of n where <code>|P(n)|</code> sets a new record; sequence gives closest integer to P(A000099(n)).
 * @author Sean A. Irvine
 */
public class A000036 implements Sequence {

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

