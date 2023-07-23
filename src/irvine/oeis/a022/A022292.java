package irvine.oeis.a022;

import irvine.math.z.Z;
import irvine.oeis.a000.A000002;

/**
 * A022292 Exactly half of first a(n) terms of Kolakoski sequence A000002 are 1's (not known to be infinite).
 * @author Sean A. Irvine
 */
public class A022292 extends A000002 {

  {
    setOffset(0);
  }

  private long mA = -1; // Counts 2 * the number of 1s

  @Override
  public Z next() {
    if (mA < 0) {
      ++mA;
      return Z.ZERO;
    }
    while (true) {
      if (Z.ONE.equals(super.next())) {
        mA += 2;
      }
      if (Z.ONE.equals(super.next())) {
        mA += 2;
      }
      if (mA == mN + 1) {
        return Z.valueOf(mA);
      }
    }
  }
}
