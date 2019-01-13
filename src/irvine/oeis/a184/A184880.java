package irvine.oeis.a184;

import irvine.oeis.LinearRecurrence;

/**
 * A184880.
 * @author Sean A. Irvine
 */
public class A184880 extends LinearRecurrence {

  /** Construct the sequence. */
  public A184880() {
    super(new long[] {-16, 8, 7, -6, 1, 2}, new long[] {1, 1, 2, -1, 1, 4});
  }
}
