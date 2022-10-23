package irvine.oeis.a058;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A058990 Smallest power of two whose reversal of its n-th power is a prime.
 * @author Sean A. Irvine
 */
public class A058990 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z k = Z.TWO;
    while (!ZUtils.reverse(k.pow(mN)).isProbablePrime()) {
      k = k.multiply2();
    }
    return k;
  }
}
