package irvine.oeis.a001;

import irvine.oeis.LinearRecurrence;

/**
 * A001644.
 * @author Sean A. Irvine
 */
public class A001644 extends LinearRecurrence {

  /** Construct the sequence. */
  public A001644() {
    super(new long[] {1, 1, 1}, new long[] {3, 1, 3});
  }
}
