package irvine.oeis.a069;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069522.
 * @author Sean A. Irvine
 */
public class A069572 extends Sequence1 {

  private long mN = 0;
  private Z mA = Z.ZERO;
  private Z mM = Z.ONE;

  @Override
  public Z next() {
    final long lpf = Functions.LPF.l(++mN);
    mA = mA.add(mM.multiply(lpf < 10 ? lpf : 1));
    mM = mM.multiply(10);
    return mA;
  }
}
