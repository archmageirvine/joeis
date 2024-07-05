package irvine.oeis.a071;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A071193 Least m &gt; n such that bigomega(m) != bigomega(n), where bigomega(n) = A001222(n).
 * @author Sean A. Irvine
 */
public class A071193 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    long k = ++mN;
    final long t = Functions.BIG_OMEGA.l(mN);
    while (true) {
      if (t != Functions.BIG_OMEGA.l(++k)) {
        return Z.valueOf(k);
      }
    }
  }
}
