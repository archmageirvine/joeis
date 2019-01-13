package irvine.oeis.a192;

import irvine.oeis.LinearRecurrence;

/**
 * A192778.
 * @author Sean A. Irvine
 */
public class A192778 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192778() {
    super(new long[] {1, 1, -6, -1, 6, 1}, new long[] {0, 1, 0, 5, 4, 28});
  }
}
