package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A060232 Smaller of twin primes whose mean (average) is a multiple of A002110(6)=30030.
 * @author Sean A. Irvine
 */
public class A060232 extends Sequence1 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(30030);
      if (mN.isProbablePrime() && mN.add(2).isProbablePrime()) {
        return mN;
      }
    }
  }
}
