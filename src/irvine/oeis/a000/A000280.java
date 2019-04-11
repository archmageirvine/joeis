package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000280 <code>a(n) = a(n-1) + a(n-2)^3</code>.
 * @author Sean A. Irvine
 */
public class A000280 implements Sequence {

  private Z mA = Z.NEG_ONE;
  private Z mB = Z.ONE;

  @Override
  public Z next() {
    final Z t = mB.add(mA.pow(3));
    mA = mB;
    mB = t;
    return t;
  }
}
