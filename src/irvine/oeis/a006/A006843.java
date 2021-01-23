package irvine.oeis.a006;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A006843 Triangle read by rows: row n gives denominators of Farey series of order n.
 * @author Sean A. Irvine
 */
public class A006843 extends A006842 {

  @Override
  protected Z select(final Q q) {
    return q.den();
  }
}
