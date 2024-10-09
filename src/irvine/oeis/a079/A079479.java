package irvine.oeis.a079;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a072.A072526;

/**
 * A072523.
 * @author Sean A. Irvine
 */
public class A079479 extends A072526 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
