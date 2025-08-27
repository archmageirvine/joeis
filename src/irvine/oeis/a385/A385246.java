package irvine.oeis.a385;

import irvine.math.z.Z;

/**
 * A385246 allocated for Clark Kimberling.
 * @author Sean A. Irvine
 */
public class A385246 extends A385476 {

  @Override
  protected Z select(final long u, final long v, final long w) {
    return Z.valueOf(w);
  }
}
