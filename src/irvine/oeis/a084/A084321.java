package irvine.oeis.a084;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A084321 Least number k such that between k! and (k+1)! there are n powers of 2 (each interval includes (k+1)! but not k!).
 * @author Sean A. Irvine
 */
public class A084321 extends Sequence1 {

  private int mN = 0;
  private int mM = 1;

  private boolean is(final long m) {
    final CR lo = CR.valueOf(m + 1).lnGamma().divide(CR.LOG2);
    final CR hi = CR.valueOf(m + 2).lnGamma().divide(CR.LOG2);
    return hi.floor().subtract(lo.floor()).equals(mN);
  }

  @Override
  public Z next() {
    ++mN;
    while (!is(mM)) {
      ++mM;
    }
    return Z.valueOf(mM);
  }
}
