package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000040;

/**
 * A030092 Primes p such that p and p^3 have the same set of digits.
 * @author Sean A. Irvine
 */
public class A030092 extends Sequence1 {

  private static final Sequence A000040 = new A000040();

  @Override
  public Z next() {
    while (true) {
      final Z p = A000040.next();
      if (A030091.isOk(p, p.pow(3))) {
        return p;
      }
    }
  }
}
