package irvine.oeis.a071;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A071553 Least x greater than 1 such that x^n == 1 (mod i) for each i=1,2,3,...,n.
 * @author Sean A. Irvine
 */
public class A071553 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long s = 1;
    while (true) {
      long sum = 0;
      final Z sn = Z.valueOf(++s).pow(mN).subtract(1);
      for (long k = 1; k <= mN; ++k) {
        sum += Long.signum(sn.mod(k));
      }
      if (sum <= 0) {
        return Z.valueOf(s);
      }
    }
  }
}
