package irvine.oeis.a386;

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a005.A005384;

/**
 * A386995 Primes p such that 2p-1 is a square and 2p+1 is also prime.
 * @author Sean A. Irvine
 */
public class A386995 extends FilterSequence {

  /** Construct the sequence. */
  public A386995() {
    super(new A005384(), p -> Predicates.SQUARE.is(p.multiply2().subtract(1)));
  }
}
