package irvine.oeis.a184;

import irvine.oeis.LinearRecurrence;

/**
 * A184009.
 * @author Sean A. Irvine
 */
public class A184009 extends LinearRecurrence {

  /** Construct the sequence. */
  public A184009() {
    super(new long[] {1, -2, 1, 0, 0, 0, 0, -1, 2}, new long[] {1, 3, 6, 10, 15, 21, 27, 35, 43});
  }
}
