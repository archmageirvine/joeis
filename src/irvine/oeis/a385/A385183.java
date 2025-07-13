package irvine.oeis.a385;

import irvine.math.z.Z;

/**
 * A385183 The v sequence in quartets (1,u,v,w); see A385182.
 * @author Sean A. Irvine
 */
public class A385183 extends A385182 {

  @Override
  protected Z select(final long u, final long v, final long w) {
    return Z.valueOf(v);
  }
}
