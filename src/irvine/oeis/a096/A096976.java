package irvine.oeis.a096;

import irvine.oeis.LinearRecurrence;

/**
 * A096976.
 * @author Sean A. Irvine
 */
public class A096976 extends LinearRecurrence {

  /** Construct the sequence. */
  public A096976() {
    super(new long[] {-1, 2, 1}, new long[] {1, 0, 1});
  }
}
