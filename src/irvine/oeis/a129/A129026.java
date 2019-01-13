package irvine.oeis.a129;

import irvine.oeis.LinearRecurrence;

/**
 * A129026.
 * @author Sean A. Irvine
 */
public class A129026 extends LinearRecurrence {

  /** Construct the sequence. */
  public A129026() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 27, 108, 282, 600});
  }
}
