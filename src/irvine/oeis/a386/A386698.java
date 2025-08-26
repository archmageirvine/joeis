package irvine.oeis.a386;

import irvine.math.z.Z;

/**
 * A386698 allocated for Clark Kimberling.
 * @author Sean A. Irvine
 */
public class A386698 extends A386288 {

  @Override
  protected Z select(final long u, final long v, final long w) {
    return Z.valueOf(w);
  }
}
