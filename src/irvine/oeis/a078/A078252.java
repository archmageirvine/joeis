package irvine.oeis.a078;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A078252 Smallest n-digit multiple of n in which the even-numbered digits are all equal and the odd-numbered digits are all equal, or 0 if no such number exists.
 * @author Sean A. Irvine
 */
public class A078252 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    for (long d0 = 1; d0 < 10; ++d0) {
      for (long d1 = 0; d1 < 10; ++d1) {
        Z v = Z.ZERO;
        for (long k = 0; k < mN; ++k) {
          v = v.multiply(10).add((k & 1) == 0 ? d0 : d1);
        }
        if (v.mod(mN) == 0) {
          return v;
        }
      }
    }
    return Z.ZERO;
  }
}

