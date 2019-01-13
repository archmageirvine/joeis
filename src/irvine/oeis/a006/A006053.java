package irvine.oeis.a006;

import irvine.oeis.LinearRecurrence;

/**
 * A006053.
 * @author Sean A. Irvine
 */
public class A006053 extends LinearRecurrence {

  /** Construct the sequence. */
  public A006053() {
    super(new long[] {-1, 2, 1}, new long[] {0, 0, 1});
  }
}

