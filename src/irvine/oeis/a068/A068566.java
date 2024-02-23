package irvine.oeis.a068;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A068566 Numerator of Sum_{k=1..n} 1/(k * 2^k).
 * @author Sean A. Irvine
 */
public class A068566 extends A068565 {

  @Override
  protected Z select(final Q n) {
    return n.num();
  }
}

