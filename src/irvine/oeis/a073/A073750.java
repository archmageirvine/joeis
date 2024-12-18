package irvine.oeis.a073;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A073571.
 * @author Sean A. Irvine
 */
public class A073750 extends A073749 {

  @Override
  protected Z select(final Q n) {
    if (n.den().bitCount() > 1) {
      throw new UnsupportedOperationException("Non-unit term: " + n);
    }
    return Z.valueOf(n.den().makeOdd().auxiliary());
  }
}
