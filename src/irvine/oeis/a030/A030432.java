package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A030432 Primes of form 10n+7.
 * @author Sean A. Irvine
 */
public class A030432 extends Sequence1 {

  private Z mN = Z.valueOf(-3);

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

