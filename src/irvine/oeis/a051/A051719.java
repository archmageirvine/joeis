package irvine.oeis.a051;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A051719 Denominators of column 2 of table described in A051714/A051715.
 * @author Sean A. Irvine
 */
public class A051719 extends A051718 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
