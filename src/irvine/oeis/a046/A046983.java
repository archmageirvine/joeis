package irvine.oeis.a046;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A046983 Denominators of Taylor series for tan(x + Pi/4).
 * @author Sean A. Irvine
 */
public class A046983 extends A046982 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
