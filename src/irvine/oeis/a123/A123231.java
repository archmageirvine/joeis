package irvine.oeis.a123;

import irvine.oeis.LinearRecurrence;

/**
 * A123231 Row sums of <code>A123230</code>.
 * @author Sean A. Irvine
 */
public class A123231 extends LinearRecurrence {

  /** Construct the sequence. */
  public A123231() {
    super(new long[] {1, 0, 1, 0}, new long[] {1, 2, 1, 3});
  }
}
