package irvine.oeis.a081;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a003.A003418;

/**
 * A081534 Numbers k such that 1 + 2 ... + k divides lcm(1,2,...,k), or, in other words, lcm(1,2,...,k) is a multiple of the k-th triangular number.
 * @author Sean A. Irvine
 */
public class A081534 extends Sequence1 {

  private final Sequence mLcm = new A003418().skip();
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (mLcm.next().mod(Functions.TRIANGULAR.z(++mN)).isZero()) {
        return Z.valueOf(mN);
      }
    }
  }
}
