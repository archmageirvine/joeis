package irvine.oeis.a035;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A035048 Numerators of alternating sum transform (PSumSIGN) of Harmonic numbers H(n) = A001008/A002805.
 * @author Sean A. Irvine
 */
public class A035048 extends A035047 {

  @Override
  protected Z select(final Q n) {
    return n.num();
  }
}
