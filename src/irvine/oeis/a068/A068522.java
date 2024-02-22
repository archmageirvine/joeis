package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A068522 In base 10 notation replace digits of n with their squared values (Version 2).
 * @author Sean A. Irvine
 */
public class A068522 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    final String digits = String.valueOf(++mN);
    Z res = Z.ZERO;
    for (int k = 0; k < digits.length(); ++k) {
      final int v = digits.charAt(k) - '0';
      res = res.multiply(10).add(v * v);
    }
    return res;
  }
}

