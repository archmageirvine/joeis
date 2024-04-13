package irvine.oeis.a002;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A002998 Smallest multiple of n whose digits sum to n.
 * @author Sean A. Irvine
 */
public class A002998 extends Sequence0 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    final long n = mN.longValueExact();
    Z k = Z.ZERO;
    while (true) {
      k = k.add(mN);
      if (Functions.DIGIT_SUM.l(k) == n) {
        return k;
      }
    }
  }
}
