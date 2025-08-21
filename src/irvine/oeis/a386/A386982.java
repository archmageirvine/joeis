package irvine.oeis.a386;

import irvine.math.z.Z;
import irvine.oeis.a385.A385884;

/**
 * A386982 allocated for Clark Kimberling.
 * @author Sean A. Irvine
 */
public class A386982 extends A385884 {

  @Override
  protected Z select(final long u, final long v, final long w) {
    return Z.valueOf(w);
  }
}
