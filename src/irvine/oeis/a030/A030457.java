package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A030457 Numbers n such that n concatenated with <code>n+1</code> is prime.
 * @author Sean A. Irvine
 */
public class A030457 implements Sequence {

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
