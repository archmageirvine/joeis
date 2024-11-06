package irvine.oeis.a072;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072943 Least nonnegative integer k such that n + k^3 is prime, or -1 if no such k exists.
 * @author Sean A. Irvine
 */
public class A072943 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    if (Z.valueOf(mN).root(3).auxiliary() == 1) {
      return Z.NEG_ONE;
    }
    Z k = Z.NEG_ONE;
    while (true) {
      k = k.add(1);
      if (k.pow(3).add(mN).isProbablePrime()) {
        return k;
      }
    }
  }
}

