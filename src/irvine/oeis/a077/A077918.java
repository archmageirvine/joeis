package irvine.oeis.a077;

import irvine.oeis.LinearRecurrence;

/**
 * A077918.
 * @author Sean A. Irvine
 */
public class A077918 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077918() {
    super(new long[] {1, -3, 4, -1}, new long[] {1, -1, 5, -12});
  }
}
