package irvine.oeis.a392;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A392625 allocated for Natalia L. Skirrow.
 * @author Sean A. Irvine
 */
public class A392625 extends A392624 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
