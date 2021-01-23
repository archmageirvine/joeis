package irvine.oeis.a036;

import irvine.oeis.FiniteSequence;

/**
 * A036331 Composite numbers n such that juxtaposition of prime factors of n has length 7.
 * @author Sean A. Irvine
 */
public class A036331 extends FiniteSequence {

  /** Construct the sequence. */
  public A036331() {
    super(A036328.build(7));
  }
}
