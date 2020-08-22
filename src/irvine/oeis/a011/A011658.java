package irvine.oeis.a011;

import irvine.oeis.PeriodicSequence;

/**
 * A011658 Period 5: repeat [0, 0, 0, 1, 1]; also expansion of 1/(x^4 + x^3 + x^2 + x + 1) (mod 2).
 * @author Sean A. Irvine
 */
public class A011658 extends PeriodicSequence {

  /** Construct the sequence. */
  public A011658() {
    super(0, 0, 0, 1, 1);
  }
}
