package irvine.oeis.a034;

import irvine.oeis.DigitSequence;
import irvine.oeis.a000.A000217;

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
