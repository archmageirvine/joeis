package irvine.oeis.a024;

import irvine.oeis.FiniteSequence;

/**
 * A024782 Every suffix prime and no 0 digits in base 7 (written in base 7).
 * @author Sean A. Irvine
 */
public class A024782 extends FiniteSequence {

  /** Construct the sequence. */
  public A024782() {
    super(A024781.build(7));
  }
}
