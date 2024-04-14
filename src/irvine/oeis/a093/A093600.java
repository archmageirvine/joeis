package irvine.oeis.a093;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a069.A069220;

/**
 * A093600 Numerator of Sum_{1&lt;=k&lt;=n, gcd(k,n)=1} 1/k.
 * @author Sean A. Irvine
 */
public class A093600 extends A069220 {

  @Override
  protected Z select(final Q n) {
    return n.num();
  }
}

