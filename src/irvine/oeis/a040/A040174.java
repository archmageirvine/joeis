package irvine.oeis.a040;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A002844.
 * @author Sean A. Irvine
 */
public class A040174 extends A040173 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
