package irvine.oeis.a063;

import irvine.math.z.Z;
import irvine.oeis.a001.A001359;

/**
 * A063502 a(n+1) = p, where p is the a(n)-th twin prime (p,p+2), with a(0) = 1.
 * @author Sean A. Irvine
 */
public class A063502 extends A001359 {

  private Z mA = null;
  private long mM = 0;
  {
    setOffset(0);
  }

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
    } else {
      final long a = mA.longValueExact();
      while (mM < a) {
        mA = super.next();
        ++mM;
      }
    }
    return mA;
  }
}
