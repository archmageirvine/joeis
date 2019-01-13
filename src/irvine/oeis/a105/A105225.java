package irvine.oeis.a105;

import irvine.oeis.LinearRecurrence;

/**
 * A105225.
 * @author Sean A. Irvine
 */
public class A105225 extends LinearRecurrence {

  /** Construct the sequence. */
  public A105225() {
    super(new long[] {2, -3, 2}, new long[] {1, -1, -2});
  }
}
