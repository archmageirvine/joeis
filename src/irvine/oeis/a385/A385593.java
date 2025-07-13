package irvine.oeis.a385;

import irvine.math.z.Z;

/**
 * A385593 The v sequence in quartets (2,u,v,w); see A385592.
 * @author Sean A. Irvine
 */
public class A385593 extends A385592 {

  @Override
  protected Z select(final long u, final long v, final long w) {
    return Z.valueOf(v);
  }
}
