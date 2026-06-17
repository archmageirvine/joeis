package irvine.oeis.a085;

import irvine.oeis.a014.A014571;
import irvine.oeis.cons.ContinuedFractionDenominatorSequence;

/**
 * A085395 Denominators of convergents to the Thue-Morse constant 0.41245403364...
 * @author Sean A. Irvine
 */
public class A085395 extends ContinuedFractionDenominatorSequence {

  /** Construct the sequence. */
  public A085395() {
    super(1, new A014571());
  }
}
