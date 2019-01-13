package irvine.oeis.a066;

import irvine.oeis.LinearRecurrence;

/**
 * A066810.
 * @author Sean A. Irvine
 */
public class A066810 extends LinearRecurrence {

  /** Construct the sequence. */
  public A066810() {
    super(new long[] {12, -16, 7}, new long[] {0, 0, 1});
  }
}
