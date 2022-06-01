package irvine.oeis.a203;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A203625 Indices of octagonal numbers which are also decagonal.
 * @author Sean A. Irvine
 */
public class A203625 extends LinearRecurrence {

  /** Construct the sequence. */
  public A203625() {
    super(new long[] {1, -195, 195}, new long[] {1, 135, 26125});
  }
}
