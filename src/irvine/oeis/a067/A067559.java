package irvine.oeis.a067;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067559 Numbers n such that floor(Pi*n^2) is prime.
 * @author Sean A. Irvine
 */
public class A067559 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (CR.PI.multiply(++mN * mN).floor().isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
