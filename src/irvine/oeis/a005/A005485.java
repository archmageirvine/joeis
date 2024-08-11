package irvine.oeis.a005;

import irvine.oeis.cons.ContinuedFractionDenominatorSequence;

/**
 * A005485 Denominators of continued fraction convergents to cube root of 7.
 * @author Sean A. Irvine
 */
public class A005485 extends ContinuedFractionDenominatorSequence {

  /** Construct the sequence. */
  public A005485() {
    super(0, new A005482());
  }
}
