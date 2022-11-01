package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A060231 Smaller of twin primes whose middle term is a multiple of A002110(5)=2310.
 * @author Sean A. Irvine
 */
public class A060231 extends Sequence1 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(2310);
      if (mN.isProbablePrime() && mN.add(2).isProbablePrime()) {
        return mN;
      }
    }
  }
}
