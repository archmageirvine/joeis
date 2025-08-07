package irvine.oeis.a386;

import irvine.math.z.Z;

/**
 * A386629 allocated for Clark Kimberling.
 * @author Sean A. Irvine
 */
public class A386629 extends A386627 {

  @Override
  protected Z select(final long u, final long v, final Z w) {
    return w;
  }
}
