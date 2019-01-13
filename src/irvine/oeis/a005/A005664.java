package irvine.oeis.a005;

import irvine.oeis.ContinuedFractionDenominatorSequence;
import irvine.oeis.a020.A020857;

/**
 * A005664.
 * @author Sean A. Irvine
 */
public class A005664 extends ContinuedFractionDenominatorSequence {

  /** Construct the sequence. */
  public A005664() {
    super(new A020857());
  }
}

