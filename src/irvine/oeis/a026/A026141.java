package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026141 <code>a(n) = (1/2)*|s(n)-s(n-1)|</code>, where s <code>= A026139</code>.
 * @author Sean A. Irvine
 */
public class A026141 extends A026139 {

  private Z mA = super.next();

  @Override
  public Z next() {
    final Z t = mA;
    mA = super.next();
    return mA.subtract(t).abs().divide2();
  }
}
