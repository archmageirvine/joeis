package irvine.oeis.a027;

import irvine.oeis.FiniteSequence;

/**
 * A027904 Terminating decimals of length n of form <code>p/2^q</code> using at most one of each nonzero digit.
 * @author Georg Fischer
 */
public class A027904 extends FiniteSequence {

  /** Construct the sequence. */
  public A027904() {
    super(1, 2, 4, 7, 9, 12, 10, 7, 2, 1, 1);
  }
}
