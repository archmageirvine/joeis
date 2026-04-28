package irvine.oeis.a395;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A395448 allocated for Jwalin Bhatt.
 * @author Sean A. Irvine
 */
public class A395448 extends A395447 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
