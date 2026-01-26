package irvine.oeis.a392;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A392725 allocated for Joshua B. Weinstein.
 * @author Sean A. Irvine
 */
public class A392725 extends Sequence1 {

  private Z mA = Z.ONE;
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN > 0) {
      mA = mA.signedAdd((Functions.DIGIT_SUM.l(mA) & 1) == 0, Z.valueOf(mN));
    }
    return mA;
  }
}
