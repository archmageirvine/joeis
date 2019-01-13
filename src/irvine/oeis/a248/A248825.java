package irvine.oeis.a248;

import irvine.oeis.LinearRecurrence;

/**
 * A248825.
 * @author Sean A. Irvine
 */
public class A248825 extends LinearRecurrence {

  /** Construct the sequence. */
  public A248825() {
    super(new long[] {1, -2, 0, 2}, new long[] {0, 3, 4, 11});
  }
}
