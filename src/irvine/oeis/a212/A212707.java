package irvine.oeis.a212;

import irvine.oeis.FilterSequence;

/**
 * A212707 Semiprimes of the form 5*n^2 + 1.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A212707 extends FilterSequence {

  /** Construct the sequence. */
  public A212707() {
    super(1, new A212656(), SEMIPRIME);
  }
}
