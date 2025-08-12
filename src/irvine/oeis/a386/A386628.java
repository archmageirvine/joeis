package irvine.oeis.a386;

import irvine.math.z.Z;
import irvine.oeis.a385.A385882;

/**
 * A386628 allocated for Clark Kimberling.
 * @author Sean A. Irvine
 */
public class A386628 extends A385882 {

  /** Construct the sequence. */
  public A386628() {
    super(1, 2, 3);
  }

  @Override
  protected Z select(final long u, final long v, final Z w) {
    return Z.valueOf(v);
  }
}
