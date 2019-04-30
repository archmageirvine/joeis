package irvine.oeis.a000;

import irvine.math.Hypersphere;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000099 Let <code>A(n) = #{(i,j)</code>: <code>i^2 + j^2 &lt;= n}, V(n) =</code> Pi*n, <code>P(n) = A(n) - V(n)</code>; sequence gives values of n where <code>|P(n)|</code> sets a new record.
 * @author Sean A. Irvine
 */
public class A000099 implements Sequence {

  private int mN = 0;
  private double mDeviation = 0;

  @Override
  public Z next() {
    while (true) {
      final Z c = Hypersphere.countPoints(2, ++mN);
      final double dev = Math.abs(c.doubleValue() - Math.PI * mN);
      if (dev > mDeviation) {
        mDeviation = dev;
        return Z.valueOf(mN);
      }
    }
  }
}

