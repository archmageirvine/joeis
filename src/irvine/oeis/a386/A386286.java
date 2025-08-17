package irvine.oeis.a386;

import irvine.math.z.Z;

/**
 * A386218.
 * @author Sean A. Irvine
 */
public class A386286 extends A386285 {

  @Override
  protected Z select(final long u, final long v, final long w) {
    return Z.valueOf(v);
  }
}
