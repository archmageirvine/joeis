package irvine.oeis.a199;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A199930 Trisection 0 of A199803.
 * @author Sean A. Irvine
 */
public class A199930 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199930() {
    super(new long[] {-1, 1, -5, -1}, new long[] {1, -2, -1, 12});
  }
}
