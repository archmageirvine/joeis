package irvine.oeis.a006;

import irvine.oeis.LinearRecurrence;

/**
 * A006452.
 * @author Sean A. Irvine
 */
public class A006452 extends LinearRecurrence {

  /** Construct the sequence. */
  public A006452() {
    super(new long[] {-1, 0, 6, 0}, new long[] {1, 1, 2, 4});
  }
}
