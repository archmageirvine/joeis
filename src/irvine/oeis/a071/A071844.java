package irvine.oeis.a071;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A071844 Numbers k such that reverse(gpf(k)) = gpf(k+1), where gpf(n) = A006530(n); a(1)=1.
 * @author Sean A. Irvine
 */
public class A071844 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (mN == 0) {
      ++mN;
      return Z.ONE;
    }
    while (true) {
      if (Functions.REVERSE.l(Functions.GPF.l(++mN)) == Functions.GPF.l(mN + 1)) {
        return Z.valueOf(mN);
      }
    }
  }
}
