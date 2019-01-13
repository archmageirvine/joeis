package irvine.oeis.a263;

import irvine.oeis.LinearRecurrence;

/**
 * A263807.
 * @author Sean A. Irvine
 */
public class A263807 extends LinearRecurrence {

  /** Construct the sequence. */
  public A263807() {
    super(new long[] {1, -2, 0, 2}, new long[] {1, 3, 6, 11});
  }
}
