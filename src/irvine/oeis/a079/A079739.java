package irvine.oeis.a079;

import irvine.math.z.Z;
import irvine.oeis.TwoParameterFormSequence;

/**
 * A079739 Primes of the form x^2 + y^2 + 2 (x,y nonnegative).
 * @author Sean A. Irvine
 */
public class A079739 extends TwoParameterFormSequence {

  /** Construct the sequence. */
  public A079739() {
    super(1, 0, 0, (x, y) -> Z.valueOf(x).square().add(Z.valueOf(y).square()).add(2));
  }

  @Override
  protected boolean accept(final long x, final long y, final Z n, final Z prev) {
    return !n.equals(prev) && n.isProbablePrime();
  }
}
