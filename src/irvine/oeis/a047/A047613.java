package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047613.
 * @author Sean A. Irvine
 */
public class A047613 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047613() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {1, 2, 4, 5, 9});
  }
}
