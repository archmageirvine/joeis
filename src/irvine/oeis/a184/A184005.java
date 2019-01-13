package irvine.oeis.a184;

import irvine.oeis.LinearRecurrence;

/**
 * A184005.
 * @author Sean A. Irvine
 */
public class A184005 extends LinearRecurrence {

  /** Construct the sequence. */
  public A184005() {
    super(new long[] {1, -2, 0, 2}, new long[] {1, 4, 9, 15});
  }
}
