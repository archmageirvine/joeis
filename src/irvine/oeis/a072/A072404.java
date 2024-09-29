package irvine.oeis.a072;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A072404 Denominator of the Reingold-Tarjan sequence, numerator=A072403.
 * @author Sean A. Irvine
 */
public class A072404 extends A072403 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
