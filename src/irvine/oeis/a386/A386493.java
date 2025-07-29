package irvine.oeis.a386;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A386493 allocated for Stefano Spezia.
 * @author Sean A. Irvine
 */
public class A386493 extends A386492 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
