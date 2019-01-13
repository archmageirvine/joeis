package irvine.oeis.a032;

import irvine.oeis.LinearRecurrence;

/**
 * A032091.
 * @author Sean A. Irvine
 */
public class A032091 extends LinearRecurrence {

  /** Construct the sequence. */
  public A032091() {
    super(new long[] {1, -3, 1, 5, -5, -1, 3}, new long[] {2, 6, 16, 32, 60, 100, 160});
  }
}
