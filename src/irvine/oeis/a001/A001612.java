package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001612 <code>a(n) = a(n-1) + a(n-2) - 1</code> for <code>n &gt; 1, a(0)=3, a(1)=2</code>.
 * @author Sean A. Irvine
 */
public class A001612 implements Sequence {

  private Z mA = Z.FOUR;
  private Z mB = Z.ZERO;

  @Override
  public Z next() {
    final Z t = mA.add(mB).subtract(1);
    mA = mB;
    mB = t;
    return t;
  }
}
