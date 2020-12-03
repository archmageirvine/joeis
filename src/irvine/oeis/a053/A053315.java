package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A053315 a(n) contains n digits (either '4' or '5') and is divisible by 2^n.
 * @author Sean A. Irvine
 */
public class A053315 implements Sequence {

  private Z mA = Z.ZERO;
  private Z mT = Z.ONE;
  private Z mS = null;

  @Override
  public Z next() {
    mS = mS == null ? Z.ONE : mS.multiply(10);
    mT = mT.multiply2();
    final Z a = mS.multiply(4).add(mA);
    if (a.mod(mT).isZero()) {
      mA = a;
    } else {
      mA = mS.multiply(5).add(mA);
    }
    return mA;
  }
}
