package irvine.oeis.a386;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A386491 allocated for Stefano Spezia.
 * @author Sean A. Irvine
 */
public class A386491 extends A386490 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
