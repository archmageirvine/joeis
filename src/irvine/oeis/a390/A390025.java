package irvine.oeis.a390;

import irvine.math.z.Z;

/**
 * A390025 allocated for Clark Kimberling.
 * @author Sean A. Irvine
 */
public class A390025 extends A390024 {

  @Override
  protected Z select(final long u, final long v, final long w) {
    return Z.valueOf(v);
  }
}
