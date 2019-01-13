package irvine.oeis.a001;

import irvine.oeis.LinearRecurrence;

/**
 * A001591.
 * @author Sean A. Irvine
 */
public class A001591 extends LinearRecurrence {

  /** Construct the sequence. */
  public A001591() {
    super(new long[] {1, 1, 1, 1, 1}, new long[] {0, 0, 0, 0, 1});
  }
}
