package irvine.oeis.a065;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A065955 Floor of (-1)^n*n!*(E(n,2)-E(n,1)*E(n-1,1)) where E(n,x) = Sum_{k=0..n} (-1)^k*x^k/k!.
 * @author Sean A. Irvine
 */
public class A065955 extends A065952 {

  @Override
  protected Z select(final Q n) {
    return n.toZ();
  }
}
