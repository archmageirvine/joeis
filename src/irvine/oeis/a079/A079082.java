package irvine.oeis.a079;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A079082 Denominator of (prime(n)+1)*(prime(n+1)+1)/(4*(prime(n)*prime(n+1)+1)).
 * @author Sean A. Irvine
 */
public class A079082 extends A079081 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
