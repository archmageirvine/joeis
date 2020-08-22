package irvine.oeis.a099;

import irvine.math.z.Z;
import irvine.oeis.a000.A000796;

/**
 * A099297 Number of times the digit 6 appears in the first 10^n digits of Pi.
 * @author Sean A. Irvine
 */
public class A099297 extends A000796 {

  private long mC = 0;
  private long mP = 1;
  private long mT = 10;

  @Override
  public Z next() {
    do {
      if (Z.SIX.equals(super.next())) {
        ++mC;
      }
    } while (++mP != mT);
    mT *= 10;
    return Z.valueOf(mC);
  }
}
