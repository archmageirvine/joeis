package irvine.oeis.a037;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A037029 Primes of the form 666*n + 1.
 * @author Sean A. Irvine
 */
public class A037029 extends Sequence1 {

  private Z mN = Z.valueOf(1333);

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(666);
      if (mN.isProbablePrime()) {
        return mN;
      }
    }
  }
}

