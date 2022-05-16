package irvine.oeis.a050;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A050507 Solutions to sigma(x)+2=sigma(x+2) other than the smaller of twin primes.
 * @author Sean A. Irvine
 */
public class A050507 implements Sequence {

  private Z mN = Z.valueOf(433);

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (!mN.isProbablePrime() && Jaguar.factor(mN).sigma().add(2).equals(Jaguar.factor(mN.add(2)).sigma())) {
        return mN;
      }
    }
  }
}
