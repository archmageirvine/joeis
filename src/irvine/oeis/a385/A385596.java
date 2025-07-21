package irvine.oeis.a385;

import irvine.math.z.Z;

/**
 * A385596 The v sequence in quartets (3,u,v,w); see A385595.
 * @author Sean A. Irvine
 */
public class A385596 extends A385595 {

  @Override
  protected Z select(final long u, final long v, final long w) {
    return Z.valueOf(v);
  }
}
