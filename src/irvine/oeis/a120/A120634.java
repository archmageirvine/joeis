package irvine.oeis.a120;

import irvine.oeis.LinearRecurrence;

/**
 * A120634 Decimal equivalent of <code>A066335</code>.
 * @author Sean A. Irvine
 */
public class A120634 extends LinearRecurrence {

  /** Construct the sequence. */
  public A120634() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {0, 7, 6, 5, 4});
  }
}
