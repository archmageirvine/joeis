package irvine.oeis.a387;

import irvine.math.z.Z;
import irvine.oeis.a386.A386631;

/**
 * A387226 allocated for Clark Kimberling.
 * @author Sean A. Irvine
 */
public class A387226 extends A386631 {

  @Override
  protected Z select(final long u, final long v, final long w) {
    return Z.valueOf(w);
  }
}
