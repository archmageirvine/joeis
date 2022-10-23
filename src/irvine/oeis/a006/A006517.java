package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A006517 Numbers k such that k divides 2^k + 2.
 * @author Sean A. Irvine
 */
public class A006517 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (Z.ONE.shiftLeft(mN).add(2).mod(mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
