package irvine.oeis.a050;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A050507 Solutions to sigma(x)+2=sigma(x+2) other than the smaller of twin primes.
 * @author Sean A. Irvine
 */
public class A050507 extends Sequence1 {

  private Z mN = Z.valueOf(433);

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (!mN.isProbablePrime() && Functions.SIGMA.z(mN).add(2).equals(Functions.SIGMA.z(mN.add(2)))) {
        return mN;
      }
    }
  }
}
