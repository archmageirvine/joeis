package irvine.oeis.a087;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002110;

/**
 * A087398 Primes of the form primorial(P(k))/2-2.
 * @author Sean A. Irvine
 */
public class A087398 extends Sequence1 {

  private final Sequence mP = new A002110();

  @Override
  public Z next() {
    while (true) {
      final Z t = mP.next().divide2().subtract(2);
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}
