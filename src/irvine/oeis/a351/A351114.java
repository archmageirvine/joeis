package irvine.oeis.a351;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.CharacteristicFunction;
import irvine.oeis.DirectSequence;
import irvine.oeis.a020.A020492;

/**
 * A351114 Characteristic function of balanced numbers: a(n) = 1 if phi(n) divides sigma(n), otherwise 0.
 * @author Georg Fischer
 */
public class A351114 extends CharacteristicFunction implements DirectSequence {

  /** Construct the sequence. */
  public A351114() {
    super(1, new A020492());
  }

  @Override
  public Z a(final Z n) {
    return Predicates.BALANCED.is(n) ? Z.ONE : Z.ZERO;
  }

  @Override
  public Z a(final int n) {
    return Predicates.BALANCED.is(n) ? Z.ONE : Z.ZERO;
  }

}
