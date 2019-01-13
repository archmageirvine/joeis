package irvine.oeis.a093;

import irvine.oeis.LinearRecurrence;

/**
 * A093328.
 * @author Sean A. Irvine
 */
public class A093328 extends LinearRecurrence {

  /** Construct the sequence. */
  public A093328() {
    super(new long[] {1, -3, 3}, new long[] {3, 5, 11});
  }
}
