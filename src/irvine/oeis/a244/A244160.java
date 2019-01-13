package irvine.oeis.a244;

import irvine.math.z.Z;
import irvine.oeis.a000.A000245;

/**
 * A244160.
 * @author Sean A. Irvine
 */
public class A244160 extends A000245 {

  private Z mN = Z.ZERO;
  private long mM = 1;
  {
    super.next();
  }

  @Override
  public Z next() {
    if (--mM < 0) {
      mM = super.next().longValueExact() - 1;
      mN = mN.add(1);
    }
    return mN;
  }
}
