package irvine.oeis.a005;

import irvine.oeis.a020.A020857;
import irvine.oeis.cons.ContinuedFractionNumeratorSequence;

/**
 * A005663 Numerators of convergents to log_2(3) = log(3)/log(2).
 * @author Sean A. Irvine
 */
public class A005663 extends ContinuedFractionNumeratorSequence {

  /** Construct the sequence. */
  public A005663() {
    super(0, new A020857());
  }
}

