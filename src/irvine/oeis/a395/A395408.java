package irvine.oeis.a395;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000129;

/**
 * A395408 Primes of the form P(k)^2 - 2, where P(k) is the k-th Pell number.
 * @author Sean A. Irvine
 */
public class A395408 extends Sequence1 {

  private final Sequence mPell = new A000129();

  @Override
  public Z next() {
    while (true) {
      final Z t = mPell.next().square().subtract(2);
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}
