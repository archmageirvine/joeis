package irvine.oeis.a228;

import irvine.oeis.LinearRecurrence;

/**
 * A228967.
 * @author Sean A. Irvine
 */
public class A228967 extends LinearRecurrence {

  /** Construct the sequence. */
  public A228967() {
    super(new long[] {-1, 0, 2, 0}, new long[] {2, 9, 4, 18});
  }
}
