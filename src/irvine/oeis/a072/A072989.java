package irvine.oeis.a072;

import irvine.math.LongUtils;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072989 Numbers m&gt;0 such that the number of solutions to x^m==1 (mod m), 1&lt;=x&lt;=m, is not equal to gcd(m, phi(m)).
 * @author Sean A. Irvine
 */
public class A072989 extends Sequence1 {

  private long mN = 19;

  @Override
  public Z next() {
    while (true) {
      final long gcd = Functions.GCD.l(++mN, Functions.PHI.l(mN));
      long cnt = 0;
      for (long k = 1; k <= mN && cnt <= gcd; ++k) {
        if (LongUtils.modPow(k, mN, mN) == 1) {
          ++cnt;
        }
      }
      if (cnt != gcd) {
        return Z.valueOf(mN);
      }
    }
  }
}

