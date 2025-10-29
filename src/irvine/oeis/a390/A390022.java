package irvine.oeis.a390;

import irvine.math.z.Z;

/**
 * A385476.
 * @author Sean A. Irvine
 */
public class A390022 extends A390021 {

  @Override
  protected Z select(final long u, final long v, final long w) {
    return Z.valueOf(v);
  }
}
