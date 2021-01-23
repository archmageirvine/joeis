package irvine.oeis.a022;

import irvine.math.z.Z;
import irvine.oeis.a000.A000002;

/**
 * A022293 Sequence A022292 divided by 2.
 * @author Sean A. Irvine
 */
public class A022293 extends A000002 {

  private long mA = 0; // Counts 2 * the number of 1s

  @Override
  public Z next() {
    while (true) {
      if (Z.ONE.equals(super.next())) {
        mA += 2;
      }
      if (Z.ONE.equals(super.next())) {
        mA += 2;
      }
      if (mA == mN + 1) {
        return Z.valueOf(mA / 2);
      }
    }
  }
}
