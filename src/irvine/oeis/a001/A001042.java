package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001042 <code>a(n) = a(n-1)^2 - a(n-2)^2</code>.
 * @author Sean A. Irvine
 */
public class A001042 implements Sequence {

  private Z mA = Z.valueOf(-2);
  private Z mB = Z.NEG_ONE;

  @Override
  public Z next() {
    final Z t = mB.subtract(mA);
    mA = mB;
    mB = t.square();
    return t;
  }
}
