package irvine.oeis.a020;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A020724 G.f.: <code>1/((1-6x)(1-9x)(1-12x))</code>.
 * @author Sean A. Irvine
 */
public class A020724 implements Sequence {

  private Z mA = Z.valueOf(12);
  private Z mB = Z.valueOf(18);
  private Z mC = Z.SIX;

  @Override
  public Z next() {
    mA = mA.multiply(12);
    mB = mB.multiply(9);
    mC = mC.multiply(6);
    return mA.subtract(mB).add(mC).divide(18);
  }
}
