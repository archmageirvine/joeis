package irvine.oeis.a014;

import irvine.oeis.FiniteSequence;

/**
 * A014080 Factorions: equal to the sum of the factorials of their digits in base 10 (cf. A061602).
 * @author Sean A. Irvine
 */
public class A014080 extends FiniteSequence {

  /** Construct the sequence. */
  public A014080() {
    super(1, FINITE, 1, 2, 145, 40585);
  }
}
