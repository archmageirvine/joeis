package irvine.oeis.a384;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A384628 allocated for Ctibor O. Zizka.
 * @author Sean A. Irvine
 */
public class A384628 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 1; k <= mN; ++k) {
      sum = sum.add(Functions.GCD.l(mN, mN / k));
    }
    return sum;
  }
}

