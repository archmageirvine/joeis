package irvine.oeis.a192;

import irvine.oeis.LinearRecurrence;

/**
 * A192956.
 * @author Sean A. Irvine
 */
public class A192956 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192956() {
    super(new long[] {1, -1, -2, 3}, new long[] {1, 0, 4, 9});
  }
}
