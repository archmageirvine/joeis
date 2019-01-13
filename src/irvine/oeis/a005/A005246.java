package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005246.
 * @author Sean A. Irvine
 */
public class A005246 implements Sequence {

  private Z mA = null;
  private Z mB = null;
  private Z mC = null;

  @Override
  public Z next() {
    final Z t = mA == null ? Z.ONE : mC.multiply(mB).add(1).divide(mA);
    mA = mB;
    mB = mC;
    mC = t;
    return t;
  }
}
