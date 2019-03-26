package irvine.oeis.a307;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A307102.
 * @author Sean A. Irvine
 */
public class A307102 implements Sequence {

  private final MemoryFactorial mF = new MemoryFactorial();
  private Z mN = Z.ZERO;

  Z compute(final Z n) {
    int b = 1;
    while (mF.doubleFactorial(b).compareTo(n) <= 0) {
      ++b;
    }
    final StringBuilder sb = new StringBuilder();
    Z m = n;
    do {
      final Z[] qr = m.divideAndRemainder(mF.doubleFactorial(--b));
      if (qr[0].compareTo(Z.TEN) >= 0) {
        throw new UnsupportedOperationException();
      }
      sb.append(qr[0]);
      m = qr[1];
    } while (b > 1);
    return new Z(sb);
  }

  @Override
  public Z next() {
    mN = mN.add(1);
    return compute(mN);
  }
}

