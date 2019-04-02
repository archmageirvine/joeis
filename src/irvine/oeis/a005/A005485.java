package irvine.oeis.a005;

import irvine.oeis.ContinuedFractionDenominatorSequence;

/**
 * A005485 Denominators of convergents to cube root of 7.
 * @author Sean A. Irvine
 */
public class A005485 extends ContinuedFractionDenominatorSequence {

  /** Construct the sequence. */
  public A005485() {
    super(new A005482());
  }
}
