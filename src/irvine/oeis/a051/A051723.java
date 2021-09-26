package irvine.oeis.a051;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A051723 Denominators of row 4 of table described in A051714/A051715.
 * @author Sean A. Irvine
 */
public class A051723 extends A051722 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
