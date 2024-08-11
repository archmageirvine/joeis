package irvine.oeis.a071;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A060315.
 * @author Sean A. Irvine
 */
public class A071796 extends A071795 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
