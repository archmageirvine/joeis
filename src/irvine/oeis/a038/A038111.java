package irvine.oeis.a038;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000040;

/**
 * A038111 Denominator of density of integers with smallest prime factor prime(n).
 * @author Sean A. Irvine
 */
public class A038111 extends A038110 {

  private final Sequence mP = new A000040();

  protected Z select(final Q n) {
    return n.divide(mP.next()).den();
  }
}
