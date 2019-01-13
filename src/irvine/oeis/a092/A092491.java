package irvine.oeis.a092;

import irvine.oeis.LinearRecurrence;

/**
 * A092491.
 * @author Sean A. Irvine
 */
public class A092491 extends LinearRecurrence {

  /** Construct the sequence. */
  public A092491() {
    super(new long[] {1, -4, -4, 9, -11, 6}, new long[] {0, 0, 0, 0, 1, 6});
  }
}
