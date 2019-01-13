package irvine.oeis.a048;

import irvine.oeis.LinearRecurrence;

/**
 * A048739.
 * @author Sean A. Irvine
 */
public class A048739 extends LinearRecurrence {

  /** Construct the sequence. */
  public A048739() {
    super(new long[] {-1, -1, 3}, new long[] {1, 3, 8});
  }
}
