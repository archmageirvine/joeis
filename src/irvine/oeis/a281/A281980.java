package irvine.oeis.a281;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.TwoParameterFormSequence;

/**
 * A281980 Numbers of the form x^4 + y^2 with x^2 + 24*y a square, where x and y are nonnegative integers.
 * @author Sean A. Irvine
 */
public class A281980 extends TwoParameterFormSequence {

  /** Construct the sequence. */
  public A281980() {
    super(1, 0, 0, (x, y) -> Z.valueOf(x).pow(4).add(Z.valueOf(y).square()));
  }

  @Override
  protected boolean accept(final long x, final long y, final Z n, final Z prev) {
    return Predicates.SQUARE.is(Z.valueOf(x).square().add(24 * y));
  }
}

