package irvine.oeis.a051;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A051721 Denominators of column 3 of table described in A051714/A051715.
 * @author Sean A. Irvine
 */
public class A051721 extends A051720 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
