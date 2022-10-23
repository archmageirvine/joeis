package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A055240 Number of bases in which n is not divisible by any of its digits.
 * @author Sean A. Irvine
 */
public class A055240 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long cnt = 0;
    for (long base = mN - 1; base > 1; --base) {
      if (!A055239.is(mN, base)) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
