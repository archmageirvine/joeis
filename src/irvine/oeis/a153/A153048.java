package irvine.oeis.a153;

import irvine.oeis.FiniteSequence;

/**
 * A153048 Numbers n with property that n^2 is a concatenation of two 3-digit primes.
 * @author Georg Fischer
 */
public class A153048 extends FiniteSequence {

  /** Construct the sequence. */
  public A153048() {
    super(1, FINITE, 319, 337, 357, 363, 371, 387, 409, 447, 591, 663, 681, 701, 801, 827, 893);
  }
}
