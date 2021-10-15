package irvine.oeis.a052;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A052010 Smallest k such that the sum of the digits of n each raised to k-th power is greater than n, or 0 if no such k exists.
 * @author Sean A. Irvine
 */
public class A052010 implements Sequence {

  private Z mN = Z.NEG_ONE;

  private static Z digitSumPower(Z v, final int power) {
    Z sum = Z.ZERO;
    boolean safe = false;
    while (!v.isZero()) {
      final Z[] qr = v.divideAndRemainder(Z.TEN);
      if (qr[1].compareTo(Z.ONE) > 0) {
        safe = true;
      }
      sum = sum.add(qr[1].pow(power));
      v = qr[0];
    }
    return safe ? sum : Z.ZERO;
  }

  @Override
  public Z next() {
    mN = mN.add(1);
    int k = 0;
    while (true) {
      final Z ds = digitSumPower(mN, ++k);
      if (ds.isZero()) {
        return Z.ZERO;
      }
      if (ds.compareTo(mN) > 0) {
        return Z.valueOf(k);
      }
    }
  }
}
