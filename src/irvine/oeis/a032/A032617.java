package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A032617 Numbers n such that n concatenated with n + 2 is a prime.
 * @author Sean A. Irvine
 */
public class A032617 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (new Z(String.valueOf(++mN) + (mN + 2)).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
