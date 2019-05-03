package irvine.oeis.a030;

import irvine.oeis.FiniteSequence;

/**
 * A030064 <code>1 +</code> product of any two terms is a square.
 * @author Georg Fischer
 */
public class A030064 extends FiniteSequence {

  /** Construct the sequence. */
  public A030064() {
    super(0, 2, 4, 12, 420);
  }
}
