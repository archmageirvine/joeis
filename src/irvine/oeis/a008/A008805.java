package irvine.oeis.a008;

import irvine.oeis.AlternatingSequence;
import irvine.oeis.a000.A000217;

/**
 * A008805.
 * @author Sean A. Irvine
 */
public class A008805 extends AlternatingSequence {

  /** Construct the sequence. */
  public A008805() {
    super(new A000217(), new A000217());
    next();
    next();
  }
}


