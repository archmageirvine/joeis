package irvine.oeis.a024;

import irvine.oeis.FiniteSequence;

/**
 * A024779 Every suffix is prime and contains no 0 digits in base <code>4</code> (written in base <code>4)</code>.
 * @author Sean A. Irvine
 */
public class A024779 extends FiniteSequence {

  /** Construct the sequence. */
  public A024779() {
    super(A024781.build(4));
  }
}
