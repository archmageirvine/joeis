package irvine.oeis.a024;

import irvine.oeis.FiniteSequence;

/**
 * A024780 Every suffix prime and no 0 digits in base 5 (written in base 5).
 * @author Sean A. Irvine
 */
public class A024780 extends FiniteSequence {

  /** Construct the sequence. */
  public A024780() {
    super(1, FINITE, A024781.build(5));
  }
}
