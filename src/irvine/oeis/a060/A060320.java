package irvine.oeis.a060;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a000.A000045;

/**
 * A060320 Index of smallest Fibonacci number with exactly n distinct prime factors.
 * @author Sean A. Irvine
 */
public class A060320 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    final Sequence fibo = new A000045();
    fibo.next();
    long k = 0;
    while (true) {
      ++k;
      final Z f = fibo.next();
      if (Jaguar.factor(f).omega() == mN) {
        return Z.valueOf(k);
      }
    }
  }
}
