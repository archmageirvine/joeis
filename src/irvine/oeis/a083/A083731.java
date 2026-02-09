package irvine.oeis.a083;

import irvine.math.z.Z;
import irvine.oeis.a008.A008284;

/**
 * A083731 Triangular array such that partial sums define A008284.
 * @author Sean A. Irvine
 */
public class A083731 extends A008284 {

  private int mN = 0;
  private int mM = 0;
  private Z mA = null;

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 0;
      mA = super.next();
      return mA;
    }
    final Z t = mA;
    mA = super.next();
    return mA.subtract(t);
  }
}
