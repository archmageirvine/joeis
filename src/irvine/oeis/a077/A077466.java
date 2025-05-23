package irvine.oeis.a077;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a006.A006046;

/**
 * A077459.
 * @author Sean A. Irvine
 */
public class A077466 extends Sequence1 {

  private static final CR EXPONENT = CR.THREE.log().divide(CR.LOG2);
  private final A006046 mF = new A006046();
  private Z mN = null;

  @Override
  public Z next() {
    if (mN == null) {
      mN = Z.ONE;
      return Z.ONE;
    }
    final Z n2 = mN.multiply2();
    final Z n2m = n2.subtract(1);
    final Z n2p = n2.add(1);
    final CR m = CR.valueOf(mF.a(n2m)).divide(CR.valueOf(n2m).pow(EXPONENT));
    final CR p = CR.valueOf(mF.a(n2p)).divide(CR.valueOf(n2p).pow(EXPONENT));
    if (m.compareTo(p) <= 0) {
      mN = n2m;
    } else {
      mN = n2p;
    }
    return mF.a(mN);
  }
}
