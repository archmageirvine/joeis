package irvine.oeis.a385;

import irvine.math.z.Z;
import irvine.oeis.a386.A386218;

/**
 * A385883 allocated for Clark Kimberling.
 * @author Sean A. Irvine
 */
public class A385883 extends A386218 {

  @Override
  protected Z select(final long u, final long v, final long w) {
    return Z.valueOf(v);
  }
}
