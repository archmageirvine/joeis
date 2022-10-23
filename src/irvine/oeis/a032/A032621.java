package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A032621 Numbers k such that k concatenated with k+6 is a prime.
 * @author Sean A. Irvine
 */
public class A032621 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (new Z(String.valueOf(++mN) + (mN + 6)).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
