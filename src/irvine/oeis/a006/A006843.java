package irvine.oeis.a006;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A006843.
 * @author Sean A. Irvine
 */
public class A006843 extends A006842 {

  @Override
  protected Z select(final Q q) {
    return q.den();
  }
}
