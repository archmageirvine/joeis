package irvine.oeis.a130;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A130673 Smallest m &gt; 1 such that log m + psi(n/m) is negative, where psi(x) is the digamma function.
 * @author Sean A. Irvine
 */
public class A130673 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    long m = 1;
    while (true) {
      final long s = CR.valueOf(++m).log().add(CrFunctions.DIGAMMA.cr(new Q(mN, m))).signum();
      if (s < 0) {
        return Z.valueOf(m);
      }
    }
  }
}
