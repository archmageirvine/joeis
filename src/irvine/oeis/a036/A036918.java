package irvine.oeis.a036;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A036918 a(n) = floor(e*(n-1)*(n-1)!)).
 * @author Sean A. Irvine
 */
public class A036918 implements Sequence {

  private long mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN);
    }
    return CR.E.multiply(mF).multiply(mN).floor();
  }
}
