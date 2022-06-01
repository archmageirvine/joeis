package irvine.oeis.a120;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A120634 Decimal equivalent of A066335.
 * @author Sean A. Irvine
 */
public class A120634 extends LinearRecurrence {

  /** Construct the sequence. */
  public A120634() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {0, 7, 6, 5, 4});
  }
}
