package irvine.oeis.a079;

import irvine.math.z.Z;
import irvine.oeis.TwoParameterFormSequence;

/**
 * A079733 Primes of the form x^2 + y^2 + 3 (x,y nonnegative).
 * @author Sean A. Irvine
 */
public class A079733 extends TwoParameterFormSequence {

  /** Construct the sequence. */
  public A079733() {
    super(1, 0, 0, (x, y) -> Z.valueOf(x).square().add(Z.valueOf(y).square()).add(3));
  }

  @Override
  protected boolean accept(final long x, final long y, final Z n, final Z prev) {
    return !n.equals(prev) && n.isProbablePrime();
  }
}
