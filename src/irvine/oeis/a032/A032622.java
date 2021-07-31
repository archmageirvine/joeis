package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A032622 Numbers k such that k concatenated with k+7 is a prime.
 * @author Sean A. Irvine
 */
public class A032622 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (new Z(String.valueOf(++mN) + (mN + 7)).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
