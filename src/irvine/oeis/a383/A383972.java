package irvine.oeis.a383;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A383972 Smallest number m such that (m*(m + 1)/2)^2 is divisible by n.
 * @author Sean A. Irvine
 */
public class A383972 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long k = 0;
    while (Functions.TRIANGULAR.z(++k).square().mod(mN) != 0) {
      // do nothing
    }
    return Z.valueOf(k);
  }
}
