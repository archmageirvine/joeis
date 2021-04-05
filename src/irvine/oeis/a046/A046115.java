package irvine.oeis.a046;

import irvine.oeis.ContinuedFractionDenominatorSequence;
import irvine.oeis.a001.A001620;

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

