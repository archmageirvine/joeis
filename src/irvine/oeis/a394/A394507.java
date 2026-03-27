package irvine.oeis.a394;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A305213.
 * @author Sean A. Irvine
 */
public class A394507 extends A394506 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
