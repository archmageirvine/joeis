package irvine.oeis.a052;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A052192 Smallest a(n) for which n*a(n) has no isolated digits.
 * @author Sean A. Irvine
 */
public class A052192 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    long k = 0;
    while (true) {
      final Z s = mN.multiply(++k);
      if (!A052191.isIsolatedDigit(s)) {
        return Z.valueOf(k);
      }
    }
  }
}
