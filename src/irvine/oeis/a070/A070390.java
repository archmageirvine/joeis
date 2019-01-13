package irvine.oeis.a070;

import irvine.oeis.LinearRecurrence;

/**
 * A070390.
 * @author Sean A. Irvine
 */
public class A070390 extends LinearRecurrence {

  /** Construct the sequence. */
  public A070390() {
    super(new long[] {1, 0, 0, 0, 0}, new long[] {1, 5, 25, 37, 9});
  }
}
