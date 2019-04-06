package irvine.oeis.a234;

import irvine.oeis.FiniteSequence;

/**
 * A234631 Timestamps Hmmss where H,mm,ss are three consecutive primes, 0 &lt; H &lt; 24.
 * @author Georg Fischer
 */
public class A234631 extends FiniteSequence {

  /** Construct the sequence. */
  public A234631() {
    super(20305, 30507, 50711, 71113, 111317, 131719, 171923, 192329, 232931);
  }
}
