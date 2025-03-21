package irvine.oeis.a074;

import irvine.math.z.Z;
import irvine.oeis.a000.A000002;

/**
 * A074263 Positions of '22' in Kolakoski sequence A000002.
 * @author Sean A. Irvine
 */
public class A074263 extends A000002 {

  private long mN = 0;
  private long mA = super.next().longValue();

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final long t = mA;
      mA = super.next().longValue();
      if (mA == 2 && t == 2) {
        return Z.valueOf(mN);
      }
    }
  }
}
