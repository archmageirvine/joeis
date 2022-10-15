package irvine.oeis.a056;

import java.util.ArrayList;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A056193 Goodstein sequence starting with 4: to calculate a(n+1), write a(n) in the hereditary representation in base n+2, then bump the base to n+3, then subtract 1.
 * @author Sean A. Irvine
 */
public class A056193 implements Sequence {

  private long mN = 1;
  private Z mA = null;

  protected Z code(final Z n, final long base) {
    final ArrayList<Long> digits = new ArrayList<>();
    final Z b = Z.valueOf(base);
    Z m = n;
    while (!m.isZero()) {
      final Z[] qr = m.divideAndRemainder(b);
      digits.add(qr[1].longValue());
      m = qr[0];
    }
    Z sum = Z.ZERO;
    final Z b1 = b.add(1);
    for (int k = digits.size() - 1; k >= 0; --k) {
      sum = sum.add(b1.pow(k < base ? Z.valueOf(k) : code(Z.valueOf(k), base)).multiply(digits.get(k)));
    }
    return sum;
  }

  @Override
  public Z next() {
    mA = mA == null ? Z.FOUR : code(mA, ++mN).subtract(1);
    return mA;
  }
}
