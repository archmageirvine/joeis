package irvine.oeis.a006;

import irvine.oeis.LinearRecurrence;

/**
 * A006500.
 * @author Sean A. Irvine
 */
public class A006500 extends LinearRecurrence {

  /** Construct the sequence. */
  public A006500() {
    super(new long[] {-1, -1, 1, 1, 1, -1, 1, 1}, new long[] {1, 2, 4, 8, 12, 18, 27, 45});
  }
}

