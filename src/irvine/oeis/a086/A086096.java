package irvine.oeis.a086;

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a001.A001358;

/**
 * A086096 Semiprimes with a semiprime number of 1's in their binary representation.
 * @author Sean A. Irvine
 */
public class A086096 extends FilterSequence {

  /** Construct the sequence. */
  public A086096() {
    super(1, new A001358(), k -> Predicates.SEMIPRIME.is(k.bitCount()));
  }
}

