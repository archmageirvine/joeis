package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003402 G.f.: <code>1/((1-x)*(1-x^2)*(1-x^3)^2*(1-x^4)*(1-x^5))</code>.
 * @author Sean A. Irvine
 */
public class A003402 implements Sequence {

  private Z mA = Z.ZERO;
  private Z mB0 = Z.ZERO;
  private Z mB1 = Z.ZERO;
  private Z mGamma0 = Z.ZERO;
  private Z mGamma1 = Z.ZERO;
  private Z mGamma2 = Z.ZERO;
  private Z mE0 = Z.ZERO;
  private Z mE1 = Z.ZERO;
  private Z mE2 = Z.ZERO;
  private Z mE3 = Z.ZERO;
  private Z mF0 = Z.ZERO;
  private Z mF1 = Z.ZERO;
  private Z mF2 = Z.ZERO;
  private Z mF3 = Z.ZERO;
  private Z mF4 = Z.ZERO;
  private int mG = 5;

  private Z stepG() {
    if (++mG == 6) {
      mG = 0;
      return Z.ONE;
    }
    return Z.ZERO;
  }

  private Z stepF() {
    final Z t = mF0.add(stepG());
    mF0 = mF1;
    mF1 = mF2;
    mF2 = mF3;
    mF3 = mF4;
    mF4 = t;
    return t;
  }

  private Z stepE() {
    final Z t = mE0.add(stepF());
    mE0 = mE1;
    mE1 = mE2;
    mE2 = mE3;
    mE3 = t;
    return t;
  }

  private Z stepGamma() {
    final Z t = mGamma0.add(stepE().multiply2());
    mGamma0 = mGamma1;
    mGamma1 = mGamma2;
    mGamma2 = t;
    return t;
  }

  private Z stepB() {
    final Z t = mB0.add(stepGamma()).subtract(mE3);
    mB0 = mB1;
    mB1 = t;
    return t;
  }

  @Override
  public Z next() {
    mA = mA.add(stepB());
    return mA;
  }
}
