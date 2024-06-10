package irvine.oeis.a070;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A070547.
 * @author Sean A. Irvine
 */
public class A070547 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long cnt = 0;
    for (long k = 1; k < mN; ++k) {
      if (Functions.PHI.l(mN - k) % Functions.PHI.l(k) == 0) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
