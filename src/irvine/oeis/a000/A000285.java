package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000285 <code>a(0) = 1, a(1) = 4,</code> and <code>a(n) = a(n-1) + a(n-2)</code> for <code>n &gt;= 2</code>.
 * @author Sean A. Irvine
 */
public class A000285 implements Sequence {

  private Z mA = Z.TWO.negate();
  private Z mB = Z.THREE;

  @Override
  public Z next() {
    final Z t = mA.add(mB);
    mA = mB;
    mB = t;
    return t;
  }
}
