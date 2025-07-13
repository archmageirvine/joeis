package irvine.oeis.a385;

import irvine.math.z.Z;

/**
 * A385597 allocated for Clark Kimberling.
 * @author Sean A. Irvine
 */
public class A385597 extends A385595 {

  @Override
  protected Z select(final long u, final long v, final long w) {
    return Z.valueOf(w);
  }
}
