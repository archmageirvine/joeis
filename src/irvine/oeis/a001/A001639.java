package irvine.oeis.a001;

import irvine.oeis.LinearRecurrence;

/**
 * A001639.
 * @author Sean A. Irvine
 */
public class A001639 extends LinearRecurrence {

  /** Construct the sequence. */
  public A001639() {
    super(new long[] {1, 1, 1, 0, 1}, new long[] {1, 1, 4, 9, 16});
  }
}
