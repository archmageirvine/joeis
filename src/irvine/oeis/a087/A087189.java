package irvine.oeis.a087;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000040;
import irvine.oeis.a005.A005191;

/**
 * A087189 (P(p)-1)/2/p^2 where p runs through the odd primes different from 5 and P(k) is the k-th central pentanomial coefficient (A005191).
 * @author Sean A. Irvine
 */
public class A087189 extends Sequence1 {

  private final Sequence mP = new A000040().skip(3).prepend(3);
  private final DirectSequence mA = new A005191();

  @Override
  public Z next() {
    final Z p = mP.next();
    return mA.a(p).subtract(1).divide2().divide(p.square());
  }
}
