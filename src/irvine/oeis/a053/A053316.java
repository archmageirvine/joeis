package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A053316 a(n) contains n digits (either '2' or '3') and is divisible by 2^n.
 * @author Sean A. Irvine
 */
public class A053316 extends Sequence1 {

  private Z mA = Z.ZERO;
  private Z mT = Z.ONE;
  private Z mS = null;

  @Override
  public Z next() {
    mS = mS == null ? Z.ONE : mS.multiply(10);
    mT = mT.multiply2();
    final Z a = mS.multiply2().add(mA);
    if (a.mod(mT).isZero()) {
      mA = a;
    } else {
      mA = mS.multiply(3).add(mA);
    }
    return mA;
  }
}
