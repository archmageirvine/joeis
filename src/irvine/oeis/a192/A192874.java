package irvine.oeis.a192;

import irvine.oeis.LinearRecurrence;

/**
 * A192874.
 * @author Sean A. Irvine
 */
public class A192874 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192874() {
    super(new long[] {4, -6, -5, 6, 2}, new long[] {1, 0, 4, 6, 26});
  }
}
