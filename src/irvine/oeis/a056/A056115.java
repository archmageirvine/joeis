package irvine.oeis.a056;

import irvine.oeis.LinearRecurrence;

/**
 * A056115.
 * @author Sean A. Irvine
 */
public class A056115 extends LinearRecurrence {

  /** Construct the sequence. */
  public A056115() {
    super(new long[] {1, -3, 3}, new long[] {0, 6, 13});
  }
}
