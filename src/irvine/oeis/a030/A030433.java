package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A030433 Primes of form 10*k + 9.
 * @author Sean A. Irvine
 */
public class A030433 implements Sequence {

  private Z mN = Z.NINE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(10);
      if (mN.isProbablePrime()) {
        return mN;
      }
    }
  }
}

