package irvine.oeis.a129;

import irvine.oeis.LinearRecurrence;

/**
 * A129111.
 * @author Sean A. Irvine
 */
public class A129111 extends LinearRecurrence {

  /** Construct the sequence. */
  public A129111() {
    super(new long[] {1, -3, 3}, new long[] {8, 26, 59});
  }
}
