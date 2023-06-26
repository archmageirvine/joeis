package irvine.oeis.a024;

import irvine.oeis.FiniteSequence;

/**
 * A024783 Every suffix prime and no 0 digits in base 8 (written in base 8).
 * @author Sean A. Irvine
 */
public class A024783 extends FiniteSequence {

  /** Construct the sequence. */
  public A024783() {
    super(1, FINITE, A024781.build(8));
  }
}
