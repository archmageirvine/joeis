package irvine.oeis.a391;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A391113 Triangle read by rows: T(n,k) is the area of the irregular hexagon, rounded to the nearest integer, where its vertices lie on the co-vertices and the endpoints of the two latus rectums of an ellipse, where n and k are respectively the integer major and minor axes with n &gt;= 2 and k &gt;= 1.
 * @author Sean A. Irvine
 */
public class A391113 extends Sequence2 {

  private long mN = 2;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 1;
    }
    return CR.valueOf(mN * mN - mM * mM).sqrt().multiply(2).multiply(mN * mM + mM * mM).divide(mN).round();
  }
}
