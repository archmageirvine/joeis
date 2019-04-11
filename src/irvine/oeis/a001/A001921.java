package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001921 <code>a(n) = 14*a(n-1) - a(n-2) + 6</code> for <code>n&gt;1, a(0)=0, a(1)=7</code>.
 * @author Sean A. Irvine
 */
public class A001921 implements Sequence {

  private Z mA = Z.valueOf(-8);
  private Z mB = Z.NEG_ONE;

  @Override
  public Z next() {
    final Z t = mB.multiply(14).subtract(mA).add(6);
    mA = mB;
    mB = t;
    return mB;
  }
}
