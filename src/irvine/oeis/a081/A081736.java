package irvine.oeis.a081;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a001.A001006;

/**
 * A081736 Numbers n such that n is not an odd prime and not a square of prime and the n-th Motzkin number == 1 (mod n).
 * @author Sean A. Irvine
 */
public class A081736 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A081736() {
    super(1, 1, new A001006().skip(), (n, k) -> n > 29 && (k.mod(n) == 1 && !Predicates.PRIME.is(n) && (!Predicates.SQUARE.is(n) || !Predicates.PRIME.is(Functions.SQRT.z(n)))));
  }
}
