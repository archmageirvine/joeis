package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158735.
 * @author Sean A. Irvine
 */
public class A158735 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158735() {
    super(new long[] {1, -3, 3}, new long[] {1190, 4865, 10990});
  }
}
