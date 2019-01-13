package irvine.oeis.a249;

import irvine.oeis.LinearRecurrence;

/**
 * A249993.
 * @author Sean A. Irvine
 */
public class A249993 extends LinearRecurrence {

  /** Construct the sequence. */
  public A249993() {
    super(new long[] {8, 10, 1}, new long[] {1, 1, 11});
  }
}
