package irvine.oeis.a178;
// generated by patch_offset.pl at 2023-06-16 18:27

import irvine.oeis.DifferenceSequence;
import irvine.oeis.a007.A007443;

/**
 * A178167 Binomial transform of odd primes.
 * @author Georg Fischer
 */
public class A178167 extends DifferenceSequence {

  /** Construct the sequence. */
  public A178167() {
    super(1, new A007443());
  }
}
