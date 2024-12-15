package irvine.oeis.a073;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A073595 Denominator of b(n) = Sum_{k=1..n} (-1)^(k+1)/k*Sum_{i=0..k-1} (-1)^i/(2*i+1).
 * @author Sean A. Irvine
 */
public class A073595 extends A073594 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
