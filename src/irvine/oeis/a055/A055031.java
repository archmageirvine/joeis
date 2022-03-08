package irvine.oeis.a055;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A055031 Numerator of (Sum(m^(n-1),m=1..n-1)+1)/n.
 * @author Sean A. Irvine
 */
public class A055031 extends A055032 {

  @Override
  protected Z select(final Q n) {
    return n.num();
  }
}
