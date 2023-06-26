package irvine.oeis.a317;

import irvine.oeis.FiniteSequence;

/**
 * A317248 Semiprimes which when truncated arbitrarily on either side in base 10 yield semiprimes.
 * @author Georg Fischer
 */
public class A317248 extends FiniteSequence {

  /** Construct the sequence. */
  public A317248() {
    super(1, FINITE, 4, 6, 9, 46, 49, 69, 94, 469, 694, 949, 4694);
  }
}
