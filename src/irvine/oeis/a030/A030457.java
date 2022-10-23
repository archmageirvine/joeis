package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A030457 Numbers k such that k concatenated with k+1 is prime.
 * @author Sean A. Irvine
 */
public class A030457 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      if (mN % 3 != 1 && mN % 5 != 4 && new Z(mN + String.valueOf(mN + 1)).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
