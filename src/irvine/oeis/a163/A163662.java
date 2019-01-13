package irvine.oeis.a163;

import irvine.oeis.LinearRecurrence;

/**
 * A163662.
 * @author Sean A. Irvine
 */
public class A163662 extends LinearRecurrence {

  /** Construct the sequence. */
  public A163662() {
    super(new long[] {-100, 101}, new long[] {10, 1010});
  }
}
