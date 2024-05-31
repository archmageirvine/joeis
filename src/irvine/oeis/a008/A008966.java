package irvine.oeis.a008;

import irvine.factor.factor.Jaguar;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;

/**
 * A008966 a(n) = 1 if n is squarefree, otherwise 0.
 * @author Sean A. Irvine
 */
public class A008966 extends AbstractSequence implements DirectSequence {

  private long mN = 0;

  /** Construct the sequence. */
  public A008966() {
    super(1);
  }

  @Override
  public Z a(final Z n) {
    return Jaguar.factor(n).isSquareFree() ? Z.ONE : Z.ZERO;
  }

  @Override
  public Z a(final int n) {
    return Predicates.SQUARE_FREE.is(n) ? Z.ONE : Z.ZERO;
  }

  @Override
  public Z next() {
    return Predicates.SQUARE_FREE.is(++mN) ? Z.ONE : Z.ZERO;
  }
}

