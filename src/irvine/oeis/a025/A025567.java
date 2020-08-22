package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.oeis.a014.A014531;

/**
 * A025567 a(n) = T(n,n+1), where T is the array defined in A025564.
 * @author Sean A. Irvine
 */
public class A025567 extends A014531 {

  private Z mS = Z.ZERO;

  @Override
  public Z next() {
    final Z t = mS;
    mS = super.next();
    return mS.add(t);
  }
}
