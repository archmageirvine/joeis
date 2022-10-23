package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence0;

/**
 * A038809 a(n) is the number of ways to write n in bases 2-10 such that the digit k-1 appears in the representation in base k.
 * @author Sean A. Irvine
 */
public class A038809 extends Sequence0 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    int c = 0;
    for (int base = 2; base <= 10; ++base) {
      if (ZUtils.digitCounts(mN, base)[base - 1] > 0) {
        ++c;
      }
    }
    return Z.valueOf(c);
  }
}
