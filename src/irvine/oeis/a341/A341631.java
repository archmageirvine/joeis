package irvine.oeis.a341;
// manually 2025-09-23/filtpos

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a073.A073837;

/**
 * A341631 Numbers k such that A073837(k) is prime.
 * @author Georg Fischer
 */
public class A341631 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A341631() {
    super(1, 1, new A073837(), PRIME);
  }
}
