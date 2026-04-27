package irvine.oeis.a395;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A395198 Numbers k such that 2*k +- 1 and 5*k +- 1 are twin prime pairs.
 * @author Sean A. Irvine
 */
public class A395198 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      mN += 6;
      if (Z.valueOf(2 * mN - 1).isProbablePrime() && Z.valueOf(2 * mN + 1).isProbablePrime() && Z.valueOf(5 * mN - 1).isProbablePrime() && Z.valueOf(5 * mN + 1).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}

