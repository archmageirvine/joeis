package irvine.oeis.a076;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000045;

/**
 * A076212 Numbers k such that k and Fibonacci(k) have the same number of prime factors, counted with multiplicity.
 * @author Sean A. Irvine
 */
public class A076212 extends Sequence1 {

  private final Sequence mF = new A000045().skip();
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Functions.BIG_OMEGA.l(++mN) == Functions.BIG_OMEGA.l(mF.next())) {
        return Z.valueOf(mN);
      }
    }
  }
}
