package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A030470 Numbers k such that k concatenated with k+1, k+2, k+3 is prime.
 * @author Sean A. Irvine
 */
public class A030470 extends Sequence1 {

  private long mN = 2;

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      if (mN % 5 != 2 && new Z(mN + String.valueOf(mN + 1) + (mN + 2) + (mN + 3)).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
