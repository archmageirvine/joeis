package irvine.oeis.a060;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a000.A000045;

/**
 * A060319 Smallest Fibonacci number with n distinct prime factors.
 * @author Sean A. Irvine
 */
public class A060319 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    final Sequence fibo = new A000045();
    fibo.next();
    while (true) {
      final Z f = fibo.next();
      if (Jaguar.factor(f).omega() == mN) {
        return f;
      }
    }
  }
}
