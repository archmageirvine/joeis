package irvine.oeis.a370;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a395.A395862;

/**
 * A370703 Triangle read by rows: T(n, k) = denominator([x^k] n! [t^n] (t/2 + sqrt(1 + (t/2)^2))^(2*x)).
 * @author Sean A. Irvine
 */
public class A370703 extends A395862 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
