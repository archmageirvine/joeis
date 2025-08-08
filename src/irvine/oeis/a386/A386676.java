package irvine.oeis.a386;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A386676 allocated for David Ulgenes.
 * @author Sean A. Irvine
 */
public class A386676 extends A386675 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
