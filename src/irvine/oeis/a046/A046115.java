package irvine.oeis.a046;

import irvine.oeis.a001.A001620;
import irvine.oeis.cons.ContinuedFractionDenominatorSequence;

/**
 * A046115 Denominators of convergents to Euler-Mascheroni constant.
 * @author Sean A. Irvine
 */
public class A046115 extends ContinuedFractionDenominatorSequence {

  /** Construct the sequence. */
  public A046115() {
    super(new A001620());
  }
}

