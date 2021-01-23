package irvine.oeis.a048;

import irvine.oeis.LinearRecurrence;

/**
 * A048493 a(n) = (n+1)*2^n - n.
 * @author Sean A. Irvine
 */
public class A048493 extends LinearRecurrence {

  /** Construct the sequence. */
  public A048493() {
    super(new long[] {-4, 12, -13, 6}, new long[] {1, 3, 10, 29});
  }
}
