package irvine.oeis.a386;

import irvine.math.z.Z;

/**
 * A386630 allocated for Clark Kimberling.
 * @author Sean A. Irvine
 */
public class A386630 extends A386218 {

  @Override
  protected Z select(final long u, final long v, final long w) {
    return Z.valueOf(w);
  }
}
