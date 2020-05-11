package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.a001.A001003;

/**
 * A032037 Doubles (index <code>2+)</code> under "AIJ" <code>(ordered</code>, indistinct, labeled) transform.
 * @author Sean A. Irvine
 */
public class A032037 extends A001003 {

  private int mN = 0;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN);
    }
    return super.next().multiply(mF);
  }
}
