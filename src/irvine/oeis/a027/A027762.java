package irvine.oeis.a027;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A027762.
 * @author Sean A. Irvine
 */
public class A027762 extends A027761 {

  @Override
  protected Z select(final Q q) {
    return q.den();
  }
}
