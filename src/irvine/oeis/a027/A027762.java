package irvine.oeis.a027;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A027762 Denominator of <code>Sum_{p</code> prime, <code>p-1</code> divides <code>2*n} 1/p</code>.
 * @author Sean A. Irvine
 */
public class A027762 extends A027761 {

  @Override
  protected Z select(final Q q) {
    return q.den();
  }
}
