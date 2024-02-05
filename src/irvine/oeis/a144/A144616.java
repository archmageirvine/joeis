package irvine.oeis.a144;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a068.A068214;

/**
 * A144616 Denominators of integral specified in program line.
 * @author Sean A. Irvine
 */
public class A144616 extends A068214 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}

