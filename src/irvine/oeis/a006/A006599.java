package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A006599 Numbers k such that 2^(2k+1) + 2^(k+1) + 1 is prime.
 * @author Sean A. Irvine
 */
public class A006599 extends Sequence1 {

  private int mN = -1;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (Z.ONE.shiftLeft(2L * mN + 1).add(Z.ONE.shiftLeft(mN + 1)).add(1).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
