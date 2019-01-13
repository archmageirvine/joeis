package irvine.oeis.a202;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a012.A012859;

/**
 * A202522.
 * @author Sean A. Irvine
 */
public class A202522 extends A012859 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
