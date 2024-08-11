package irvine.oeis.a071;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A071779.
 * @author Sean A. Irvine
 */
public class A071807 extends Sequence1 {

  private int mCount = 0;
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    final long pn = Functions.PRIME.l(mN);
    final long s = Functions.SIGMA0.l(mN) * mN;
    for (int j = 1; j <= mN; ++j) {
      if (pn - Functions.PRIME.l(j) == s - Functions.SIGMA0.l(j) * j) {
        ++mCount;
      }
    }
    return Z.valueOf(mCount);
  }
}
