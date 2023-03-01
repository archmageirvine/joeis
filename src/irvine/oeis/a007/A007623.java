package irvine.oeis.a007;

import java.util.ArrayList;
import java.util.List;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A007623 Integers written in factorial base.
 * @author Sean A. Irvine
 */
public class A007623 extends Sequence0 {

  private static final MemoryFactorial F = MemoryFactorial.SINGLETON;
  private Z mN = Z.NEG_ONE;

  protected List<Z> factorialBase(final Z n) {
    int b = 1;
    while (F.factorial(b).compareTo(n) <= 0) {
      ++b;
    }
    final List<Z> res = new ArrayList<>();
    Z m = n;
    do {
      final Z[] qr = m.divideAndRemainder(F.factorial(--b));
      res.add(qr[0]);
      m = qr[1];
    } while (b > 1);
    return res;
  }

  @Override
  public Z next() {
    mN = mN.add(1);
    final StringBuilder sb = new StringBuilder();
    for (final Z t : factorialBase(mN)) {
      sb.append(t);
    }
    return new Z(sb);
  }
}

