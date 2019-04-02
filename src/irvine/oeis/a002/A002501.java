package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002501 7^n - 3*4^n + 2*3^n.
 * @author Sean A. Irvine
 */
public class A002501 implements Sequence {

  private Z mA = Z.ONE;
  private Z mB = Z.THREE;
  private Z mC = Z.TWO;
  
  @Override
  public Z next() {
    mA = mA.multiply(7);
    mB = mB.shiftLeft(2);
    mC = mC.multiply(3);
    return mA.subtract(mB).add(mC);
  }
}
