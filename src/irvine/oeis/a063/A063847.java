package irvine.oeis.a063;

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a002.A002997;

/**
 * A063847 Carmichael numbers which are also base-2 strong pseudoprimes.
 * @author Sean A. Irvine
 */
public class A063847 extends FilterSequence {

  /** Construct the sequence. */
  public A063847() {
    super(new A002997(), k -> Predicates.STRONG_PSEUDOPRIME.is(2L, k));
  }
}
