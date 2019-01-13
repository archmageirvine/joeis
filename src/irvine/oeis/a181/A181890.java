package irvine.oeis.a181;

import irvine.oeis.LinearRecurrence;

/**
 * A181890.
 * @author Sean A. Irvine
 */
public class A181890 extends LinearRecurrence {

  /** Construct the sequence. */
  public A181890() {
    super(new long[] {1, -3, 3}, new long[] {5, 27, 65});
  }
}
