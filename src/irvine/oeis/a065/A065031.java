package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A065031 In the decimal expansion of n, replace each odd digit with 1 and each even digit with 2.
 * @author Sean A. Irvine
 */
public class A065031 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    final String s = String.valueOf(++mN);
    Z res = Z.ZERO;
    for (int k = 0; k < s.length(); ++k) {
      res = res.multiply(10);
      res = res.add(2 - (s.charAt(k) & 1));
    }
    return res;
  }
}

