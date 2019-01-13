package irvine.oeis.a120;

import irvine.oeis.LinearRecurrence;

/**
 * A120969.
 * @author Sean A. Irvine
 */
public class A120969 extends LinearRecurrence {

  /** Construct the sequence. */
  public A120969() {
    super(new long[] {-15, 38, -32, 10}, new long[] {0, 10, 32, 122});
  }
}
