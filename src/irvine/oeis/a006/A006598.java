package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A006598 Numbers n such that 2^(2n+1) - 2^(n+1) + 1 is a prime.
 * @author Sean A. Irvine
 */
public class A006598 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (Z.ONE.shiftLeft(2L * mN + 1).subtract(Z.ONE.shiftLeft(mN + 1)).add(1).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
