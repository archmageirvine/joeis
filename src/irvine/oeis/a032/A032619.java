package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A032619 Numbers n such that n concatenated with <code>n + 4</code> is a prime.
 * @author Sean A. Irvine
 */
public class A032619 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (new Z(String.valueOf(++mN) + (mN + 4)).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
