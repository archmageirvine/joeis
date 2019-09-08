package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.oeis.a014.A014531;

/**
 * A025567 <code>a(n) = T(n,n+1)</code>, where T is the array defined in <code>A025564</code>.
 * @author Sean A. Irvine
 */
public class A025567 extends A014531 {

  private Z mA = Z.ZERO;

  @Override
  public Z next() {
    final Z t = mA;
    mA = super.next();
    return mA.add(t);
  }
}
