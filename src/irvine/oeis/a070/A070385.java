package irvine.oeis.a070;

import irvine.oeis.LinearRecurrence;

/**
 * A070385.
 * @author Sean A. Irvine
 */
public class A070385 extends LinearRecurrence {

  /** Construct the sequence. */
  public A070385() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 5, 25, 11, 17, 9, 7, 35, 23});
  }
}
