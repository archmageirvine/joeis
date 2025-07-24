package irvine.oeis.a078;

import irvine.math.z.Z;
import irvine.oeis.a077.A077012;

/**
 * A078921 Signed variant of A077012.
 * @author Sean A. Irvine
 */
public class A078921 extends A077012 {

  private int mN = 0;
  private int mM = -1;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return super.next().multiply(Z.NEG_ONE.pow(mN - mM));
  }
}
