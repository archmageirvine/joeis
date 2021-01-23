package irvine.oeis.a030;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A030628 1 together with numbers of the form p*q^4 and p^9, where p and q are primes.
 * @author Sean A. Irvine
 */
public class A030628 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (++mN == 1 || Z.TEN.equals(Cheetah.factor(mN).sigma0())) {
        return Z.valueOf(mN);
      }
    }
  }
}
