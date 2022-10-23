package irvine.oeis.a030;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A030628 1 together with numbers of the form p*q^4 and p^9, where p and q are primes.
 * @author Sean A. Irvine
 */
public class A030628 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (++mN == 1 || Z.TEN.equals(Jaguar.factor(mN).sigma0())) {
        return Z.valueOf(mN);
      }
    }
  }
}
