package irvine.oeis.a386;

import irvine.math.z.Z;

/**
 * A385884 allocated for Clark Kimberling.
 * @author Sean A. Irvine
 */
public class A386287 extends A386285 {

  @Override
  protected Z select(final long u, final long v, final long w) {
    return Z.valueOf(w);
  }
}
