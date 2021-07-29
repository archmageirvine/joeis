package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A032618 Numbers k such that k concatenated with k+3 is a prime.
 * @author Sean A. Irvine
 */
public class A032618 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (new Z(String.valueOf(++mN) + (mN + 3)).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
