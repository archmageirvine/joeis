package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001542 <code>a(n) = 6*a(n-1) - a(n-2)</code> for <code>n &gt; 1, a(0)=0</code> and <code>a(1)=2</code>.
 * @author Sean A. Irvine
 */
public class A001542 implements Sequence {

  private Z mA = Z.valueOf(-12);
  private Z mB = Z.valueOf(-2);

  @Override
  public Z next() {
    final Z t = mB.multiply(6).subtract(mA);
    mA = mB;
    mB = t;
    return t;
  }
}
