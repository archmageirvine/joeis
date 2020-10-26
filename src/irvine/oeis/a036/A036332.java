package irvine.oeis.a036;

import irvine.oeis.FiniteSequence;

/**
 * A036332 Composite numbers n such that juxtaposition of prime factors of n has length 8.
 * @author Sean A. Irvine
 */
public class A036332 extends FiniteSequence {

  /** Construct the sequence. */
  public A036332() {
    super(A036328.build(8));
  }
}
