package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A065244 Primes of form p = 2 + Sum_{k = 1..m} k^2 for some m.
 * @author Sean A. Irvine
 */
public class A065244 extends Sequence1 {

  private Z mS = Z.TWO;
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      mS = mS.add(Z.valueOf(++mN).square());
      if (mS.isProbablePrime()) {
        return mS;
      }
    }
  }
}

