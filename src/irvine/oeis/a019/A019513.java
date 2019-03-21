package irvine.oeis.a019;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A019513.
 * @author Sean A. Irvine
 */
public class A019513 implements Sequence {

  // todo not right from a(30)
  // There are two representations of 30, namely 20000 and 11201.
  // Sequence requires the small of these.

  private final MemoryFactorial mF = new MemoryFactorial();
  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    int b = 1;
    while (mF.doubleFactorial(b).compareTo(mN) <= 0) {
      ++b;
    }
    final StringBuilder sb = new StringBuilder();
    Z m = mN;
    do {
      final Z[] qr = m.divideAndRemainder(mF.doubleFactorial(--b));
      sb.append(qr[0]);
      m = qr[1];
    } while (b > 1);
    return new Z(sb.toString());
  }
}

