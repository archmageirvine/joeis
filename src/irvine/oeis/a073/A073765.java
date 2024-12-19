package irvine.oeis.a073;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000040;
import irvine.oeis.a002.A002808;

/**
 * A073765 a(n) = binomial(prime(n), composite(n)).
 * @author Sean A. Irvine
 */
public class A073765 extends Sequence1 {

  private final Sequence mP = new A000040();
  private final Sequence mC = new A002808();

  @Override
  public Z next() {
    return Binomial.binomial(mP.next(), mC.next());
  }
}
