package irvine.oeis.a078;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A078777 a(n) = the least positive integer k such that binomial(2k,k) + k + n is prime, if such k exists; = 0, otherwise.
 * @author Sean A. Irvine
 */
public class A078777 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ZERO;
    }
    long k = 0;
    while (true) {
      if (Binomial.binomial(2 * ++k, k).add(k).add(mN).isProbablePrime()) {
        return Z.valueOf(k);
      }
    }
  }
}

