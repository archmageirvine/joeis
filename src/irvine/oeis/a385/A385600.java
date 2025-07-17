package irvine.oeis.a385;

import irvine.math.z.Z;

/**
 * A385600 The w sequence in quartets (4,u,v,w); see A385182.
 * @author Sean A. Irvine
 */
public class A385600 extends A385598 {

  @Override
  protected Z select(final long u, final long v, final long w) {
    return Z.valueOf(w);
  }
}
