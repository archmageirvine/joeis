package irvine.oeis.a386;

import irvine.math.z.Z;

/**
 * A386697 allocated for Clark Kimberling.
 * @author Sean A. Irvine
 */
public class A386697 extends A386288 {

  @Override
  protected Z select(final long u, final long v, final long w) {
    return Z.valueOf(v);
  }
}
