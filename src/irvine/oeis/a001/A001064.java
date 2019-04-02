package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001064 a(n) = a(n-1)a(n-2) + a(n-3).
 * @author Sean A. Irvine
 */
public class A001064 implements Sequence {

  private Z mA = Z.THREE;
  private Z mB = Z.TWO;
  private Z mC = Z.NEG_ONE;

  @Override
  public Z next() {
    final Z t = mC.multiply(mB).add(mA);
    mA = mB;
    mB = mC;
    mC = t;
    return t;
  }
}
