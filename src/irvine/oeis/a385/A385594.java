package irvine.oeis.a385;

import irvine.math.z.Z;

/**
 * A385594 allocated for Clark Kimberling.
 * @author Sean A. Irvine
 */
public class A385594 extends A385592 {

  @Override
  protected Z select(final long u, final long v, final long w) {
    return Z.valueOf(w);
  }
}
