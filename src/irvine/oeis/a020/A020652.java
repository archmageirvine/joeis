package irvine.oeis.a020;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A020652 Numerators in canonical bijection from positive integers to positive rationals.
 * @author Sean A. Irvine
 */
public class A020652 extends Sequence1 {

  private long mN = 1;
  private long mM = 0;

  @Override
  public Z next() {
    while (true) {
      if (++mM >= mN) {
        ++mN;
        mM = 1;
      }
      if (LongUtils.gcd(mM, mN) == 1) {
        return Z.valueOf(mM);
      }
    }
  }
}
