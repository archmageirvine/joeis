package irvine.oeis.a024;

import irvine.oeis.FiniteSequence;

/**
 * A024784 Every suffix prime and no 0 digits in base 9 (written in base 9).
 * @author Sean A. Irvine
 */
public class A024784 extends FiniteSequence {

  /** Construct the sequence. */
  public A024784() {
    super(A024781.build(9));
  }
}
