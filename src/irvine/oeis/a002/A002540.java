package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.a000.A000961;

/**
 * A002540 Increasing gaps between <code>prime-powers</code>.
 * @author Sean A. Irvine
 */
public class A002540 extends A000961 {

  private Z mA = Z.ONE;
  private Z mMax = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      final Z t = mA;
      mA = super.next();
      final Z d = mA.subtract(t);
      if (d.compareTo(mMax) > 0) {
        mMax = d;
        return t;
      }
    }
  }
}
