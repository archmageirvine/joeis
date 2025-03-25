package irvine.oeis.a076;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076221.
 * @author Sean A. Irvine
 */
public class A076221 extends Sequence1 {

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    long cnt = 0;
    for (long k = 1; k <= mN; ++k) {
      if (k != mM && Functions.GCD.l(k, mM) == 1) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
