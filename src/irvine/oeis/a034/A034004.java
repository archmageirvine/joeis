package irvine.oeis.a034;

import irvine.oeis.a000.A000217;
import irvine.oeis.base.DigitSequence;

/**
 * A034004 Successive decimal digits of triangular numbers.
 * @author Sean A. Irvine
 */
public class A034004 extends DigitSequence {

  /** Construct the sequence. */
  public A034004() {
    super(new A000217());
  }
}
