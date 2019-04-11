package irvine.oeis.a016;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A016282 Expansion of <code>1/((1-2*x)*(1-4*x)*(1-5*x))</code>.
 * @author Sean A. Irvine
 */
public class A016282 implements Sequence {

  private Z mA = Z.ONE;
  private Z mB = Z.SIX;
  private Z mC = Z.FIVE;

  @Override
  public Z next() {
    mA = mA.multiply2();
    mB = mB.shiftLeft(2);
    mC = mC.multiply(5);
    return mA.add(mC).subtract(mB).divide(3);
  }
}
