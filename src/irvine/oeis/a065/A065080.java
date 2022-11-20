package irvine.oeis.a065;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a060.A060436;

/**
 * A065080 Denominator of Sum_{k=1..n} d(k)/k, where d() = A000005().
 * @author Sean A. Irvine
 */
public class A065080 extends A060436 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}

