package irvine.oeis.a187;

import irvine.oeis.LinearRecurrence;

/**
 * A187715.
 * @author Sean A. Irvine
 */
public class A187715 extends LinearRecurrence {

  /** Construct the sequence. */
  public A187715() {
    super(new long[] {-1, 1, 1}, new long[] {1, 5, 11});
  }
}
