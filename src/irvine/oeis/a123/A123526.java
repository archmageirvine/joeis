package irvine.oeis.a123;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A123526 Octanacci numbers.
 * @author Sean A. Irvine
 */
public class A123526 extends LinearRecurrence {

  /** Construct the sequence. */
  public A123526() {
    super(new long[] {1, 1, 1, 1, 1, 1, 1, 1}, new long[] {1, 1, 1, 1, 1, 1, 1, 1});
  }
}
