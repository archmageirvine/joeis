package irvine.oeis.a000;

import irvine.math.Hypersphere;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000413.
 * @author Sean A. Irvine
 */
public class A000413 implements Sequence {

  private int mN = -1;
  private double mDeviation = 0;

  private double v(final long n) {
    return Math.PI * 1.33333333333333333333333333333333333 * Math.pow(n, 1.5);
  }

  @Override
  public Z next() {
    while (true) {
      final Z c = Hypersphere.countPoints(3, ++mN);
      final double dev = Math.abs(c.doubleValue() - v(mN));
      if (dev > mDeviation) {
        mDeviation = dev;
        return c;
      }
    }
  }
}

