package irvine.oeis.a020;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A020758 Expansion of <code>1/((1-6x)(1-10x)(1-12x))</code>.
 * @author Sean A. Irvine
 */
public class A020758 implements Sequence {

  private Z mA = Z.valueOf(24);
  private Z mB = Z.valueOf(30);
  private Z mC = Z.SIX;

  @Override
  public Z next() {
    mA = mA.multiply(12);
    mB = mB.multiply(10);
    mC = mC.multiply(6);
    return mA.subtract(mB).add(mC).divide(24);
  }
}
