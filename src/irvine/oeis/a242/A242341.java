package irvine.oeis.a242;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.FilterNumberSequence;

/**
 * A242340 Numbers k such that k*9^k-1 is semiprime.
 * @author Sean A. Irvine
 */
public class A242341 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A242341() {
    super(1, 0, k -> Predicates.SEMIPRIME.is(Z.TEN.pow(k).multiply(k).subtract(1)));
  }
}
