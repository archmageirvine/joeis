package irvine.oeis.a056;

import java.util.ArrayList;
import java.util.Collections;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A056193.
 * @author Sean A. Irvine
 */
public class A056193 implements Sequence {

  private long mN = 1;
  private Z mA = null;

  private Z code(final Z n, final long base) {
    final ArrayList<Long> digits = new ArrayList<>();
    final Z b = Z.valueOf(base);
    Z m = n;
    while (!m.isZero()) {
      final Z[] qr = m.divideAndRemainder(b);
      digits.add(qr[1].longValue());
      m = qr[0];
    }
    Z sum = Z.ZERO;
    Collections.reverse(digits);
    final Z b1 = b.add(1);
    for (int i = 0; i < digits.size(); ++i) {
      sum = sum.add(b1.pow(digits.size() < base + i + 1 ? Z.valueOf(digits.size() - i - 1) : code(Z.valueOf(digits.size() - i - 1), base)).multiply(digits.get(i)));
    }
    return sum;
  }

  @Override
  public Z next() {
    mA = mA == null ? Z.FOUR : code(mA, ++mN).subtract(1);
    return mA;
  }
}
