package irvine.oeis.a071;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A071779.
 * @author Sean A. Irvine
 */
public class A071780 extends Sequence0 {

  private int mN = -1;
  private int mCount = 0;
  private long mS = 1;

  private void step(final long i) {
    for (long j = 1; j <= i; ++j) {
      if (Functions.PHI.z(i * j).equals(Functions.SIGMA.z(i).add(Functions.SIGMA.z(j)))) {
        ++mCount;
      }
    }
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    do {
      step(++mS);
    } while (mCount != mN);
    return Z.valueOf(mS);
  }
}
