package irvine.oeis.a077;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A077346 Triangle in which n-th row contains n smallest squares beginning with n.
 * @author Sean A. Irvine
 */
public class A077346 extends Sequence1 {

  private long mN = 0;
  private String mS = null;
  private long mM = 0;
  private long mR = 0;

  @Override
  public Z next() {
    if (++mM >= mN) {
      mS = String.valueOf(++mN);
      mM = 0;
      mR = 0;
    }
    while (true) {
      final Z sq = Z.valueOf(++mR).square();
      if (sq.toString().startsWith(mS)) {
        return sq;
      }
    }
  }
}
