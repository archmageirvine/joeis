package irvine.oeis.a079;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A079161 Satisfies a(n)/A079159(n) = p_n, the n-th prime (n&gt;0), a(0)=1.
 * @author Sean A. Irvine
 */
public class A079161 extends A079159 {

  @Override
  protected Z select(final long p, final long k, final Q s) {
    return Z.valueOf(p * k);
  }
}
