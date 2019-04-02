package irvine.oeis.a085;

import irvine.oeis.LinearRecurrence;

/**
 * A085538 a(n) = n^5 - n^4.
 * @author Sean A. Irvine
 */
public class A085538 extends LinearRecurrence {

  /** Construct the sequence. */
  public A085538() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {0, 0, 16, 162, 768, 2500});
  }
}
