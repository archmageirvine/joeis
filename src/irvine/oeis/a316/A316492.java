package irvine.oeis.a316;

import irvine.oeis.FiniteSequence;

/**
 * A316492 Numbers k such that the average digit in the concatenation of the numbers from 1 through k is <code>an</code> integer.
 * @author Georg Fischer
 */
public class A316492 extends FiniteSequence {

  /** Construct the sequence. */
  public A316492() {
    super(1, 3, 5, 7, 9, 122, 576, 1422, 1876, 4122, 4576);
  }
}
