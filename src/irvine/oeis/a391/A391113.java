package irvine.oeis.a391;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A391113 allocated for Claude H. R. Dequatre.
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
