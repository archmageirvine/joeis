package irvine.oeis.a192;

import irvine.oeis.LinearRecurrence;

/**
 * A192922.
 * @author Sean A. Irvine
 */
public class A192922 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192922() {
    super(new long[] {-1, -3, 2, 2}, new long[] {1, 0, 1, 2});
  }
}
