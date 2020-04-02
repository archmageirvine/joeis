package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A030470 Numbers n such that n concatenated with <code>n+1, n+2, n+3</code> is prime.
 * @author Sean A. Irvine
 */
public class A030470 implements Sequence {

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
