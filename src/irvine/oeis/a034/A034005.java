package irvine.oeis.a034;

import irvine.oeis.a000.A000108;
import irvine.oeis.base.DigitSequence;

/**
 * A034005 Successive digits of Catalan numbers.
 * @author Sean A. Irvine
 */
public class A034005 extends DigitSequence {

  /** Construct the sequence. */
  public A034005() {
    super(0, new A000108());
  }
}
