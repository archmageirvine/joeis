package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047276.
 * @author Sean A. Irvine
 */
public class A047276 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047276() {
    super(new long[] {-1, 1, 1}, new long[] {2, 6, 9});
  }
}
