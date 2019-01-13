package irvine.oeis.a000;

import irvine.math.Hypersphere;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000323.
 * @author Sean A. Irvine
 */
public class A000323 implements Sequence {

  private int mN = 0;
  private double mDeviation = 0;

  @Override
  public Z next() {
    while (true) {
      final Z c = Hypersphere.countPoints(2, ++mN);
      final double dev = Math.abs(c.doubleValue() - Math.PI * mN);
      if (dev > mDeviation) {
        mDeviation = dev;
        return c;
      }
    }
  }
}

