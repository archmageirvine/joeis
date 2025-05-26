package irvine.oeis.a383;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A383976 In the binary expansion of n, expand bits 1 -&gt; 11 and 0 -&gt; 10.
 * @author Sean A. Irvine
 */
public class A383976 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.TWO;
    }
    Z res = Z.ZERO;
    long m = mN;
    long k = 0;
    while (m != 0) {
      res = res.add(Z.valueOf(2 + (m & 1)).shiftLeft(k));
      k += 2;
      m >>>= 1;
    }
    return res;
  }
}
