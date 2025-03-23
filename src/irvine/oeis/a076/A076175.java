package irvine.oeis.a076;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A036301.
 * @author Sean A. Irvine
 */
public class A076175 extends A076174 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}

