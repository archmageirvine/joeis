package irvine.oeis.a005;

import irvine.oeis.ContinuedFractionNumeratorSequence;
import irvine.oeis.a020.A020857;

/**
 * A005663.
 * @author Sean A. Irvine
 */
public class A005663 extends ContinuedFractionNumeratorSequence {

  /** Construct the sequence. */
  public A005663() {
    super(new A020857());
  }
}

