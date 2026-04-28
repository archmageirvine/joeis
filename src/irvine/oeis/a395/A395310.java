package irvine.oeis.a395;

import irvine.math.z.Z;
import irvine.oeis.TwoParameterFormSequence;

/**
 * A395310 allocated for Steven Lu.
 * @author Sean A. Irvine
 */
public class A395310 extends TwoParameterFormSequence {

  /** Construct the sequence. */
  public A395310() {
    super(1, 1, 1, (x, y) -> Z.valueOf(x).square().multiply(11).add(Z.valueOf(y).square().multiply(20)).subtract(Z.valueOf(4 * x).multiply(y)));
  }

  @Override
  protected boolean accept(final long x, final long y, final Z n, final Z prev) {
    return !n.equals(prev) && n.isProbablePrime();
  }
}
