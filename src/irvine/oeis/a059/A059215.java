package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A059215 Least number k such that k^n reversed is a prime.
 * @author Sean A. Irvine
 */
public class A059215 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z k = Z.ONE;
    while (true) {
      k = k.add(1);
      if (ZUtils.reverse(k.pow(mN)).isProbablePrime()) {
        return k;
      }
    }
  }
}
