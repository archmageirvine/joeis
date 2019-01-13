package irvine.oeis.a048;

import irvine.oeis.LinearRecurrence;

/**
 * A048788.
 * @author Sean A. Irvine
 */
public class A048788 extends LinearRecurrence {

  /** Construct the sequence. */
  public A048788() {
    super(new long[] {-1, 0, 4, 0}, new long[] {0, 1, 2, 3});
  }
}
