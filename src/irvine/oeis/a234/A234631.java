package irvine.oeis.a234;

import irvine.oeis.FiniteSequence;

/**
 * A234631 Timestamps Hmmss where H,mm,ss are three consecutive primes, <code>0 &lt</code>; H <code>&lt; 24</code>.
 * @author Georg Fischer
 */
public class A234631 extends FiniteSequence {

  /** Construct the sequence. */
  public A234631() {
    super(20305, 30507, 50711, 71113, 111317, 131719, 171923, 192329, 232931);
  }
}
