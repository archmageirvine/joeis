package irvine.oeis.a007;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007623.
 * @author Sean A. Irvine
 */
public class A007623 implements Sequence {

  private final MemoryFactorial mF = new MemoryFactorial();
  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    int b = 1;
    while (mF.factorial(b).compareTo(mN) <= 0) {
      ++b;
    }
    final StringBuilder sb = new StringBuilder();
    Z m = mN;
    do {
      final Z[] qr = m.divideAndRemainder(mF.factorial(--b));
      sb.append(qr[0]);
      m = qr[1];
    } while (b > 1);
    return new Z(sb);
  }
}

