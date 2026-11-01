package irvine.oeis.a087;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000040;
import irvine.oeis.a025.A025012;

/**
 * A087194 (A(p)-1)/(2*p^2) where p runs through the odd primes different from 7 and A(k) is the k-th central heptanomial coefficient (A025012).
 * @author Sean A. Irvine
 */
public class A087194 extends Sequence1 {

  private final Sequence mP = new A000040().skip(4).prepend(3, 5);
  private final DirectSequence mA = new A025012();

  @Override
  public Z next() {
    final Z p = mP.next();
    return mA.a(p).subtract(1).divide2().divide(p.square());
  }
}
