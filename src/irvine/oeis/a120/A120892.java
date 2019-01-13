package irvine.oeis.a120;

import irvine.oeis.LinearRecurrence;

/**
 * A120892.
 * @author Sean A. Irvine
 */
public class A120892 extends LinearRecurrence {

  /** Construct the sequence. */
  public A120892() {
    super(new long[] {-1, 3, 3}, new long[] {1, 0, 3});
  }
}
