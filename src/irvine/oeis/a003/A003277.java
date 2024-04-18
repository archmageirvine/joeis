package irvine.oeis.a003;

import irvine.math.LongUtils;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A003277 Cyclic numbers: k such that k and phi(k) are relatively prime; also k such that there is just one group of order k, i.e., A000001(k) = 1.
 * @author Sean A. Irvine
 */
public class A003277 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    if (mN < 3) {
      return Z.valueOf(++mN);
    }
    while (true) {
      mN += 2;
      if (LongUtils.gcd(mN, Functions.PHI.l(mN)) == 1) {
        return Z.valueOf(mN);
      }
    }
  }

}
