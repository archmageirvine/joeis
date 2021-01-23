package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A023103 (10^n)-th digit of infinite string 12345678910111213141516...
 * @author Sean A. Irvine
 */
public class A023103 implements Sequence {

  // After Robert G. Wilson v

  private long champerknowneDigit(final Z n, final int base) {
    Z m = Z.ZERO;
    int i = 0;
    Z l;
    Z basePower = null;
    do {
      l = m;
      basePower = basePower == null ? Z.ONE : basePower.multiply(base);
      m = Z.valueOf(base - 1).multiply(++i).multiply(basePower).add(l);
    } while (m.compareTo(n) <= 0);
    final Z[] qr = n.subtract(l).divideAndRemainder(Z.valueOf(i));
    final Z q = qr[0].add(basePower);
    if (qr[1].isZero()) {
      return q.subtract(1).mod(base);
    } else {
      return q.toString(base).charAt(qr[1].intValueExact() - 1) - '0';
    }
  }

  Z mN = null;

  protected int multiplier() {
    return 10;
  }

  @Override
  public Z next() {
    mN = mN == null ? Z.ONE : mN.multiply(multiplier());
    return Z.valueOf(champerknowneDigit(mN, 10));
  }
}
