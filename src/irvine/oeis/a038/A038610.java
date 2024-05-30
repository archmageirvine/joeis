package irvine.oeis.a038;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A038610 Least common multiple of integers less than and prime to n.
 * @author Sean A. Irvine
 */
public class A038610 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z lcm = Z.ONE;
    for (int k = 2; k < mN; ++k) {
      if (Functions.GCD.l(mN, k) == 1) {
        lcm = lcm.lcm(Z.valueOf(k));
      }
    }
    return lcm;
  }
}

