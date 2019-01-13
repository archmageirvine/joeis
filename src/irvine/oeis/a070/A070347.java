package irvine.oeis.a070;

import irvine.oeis.LinearRecurrence;

/**
 * A070347.
 * @author Sean A. Irvine
 */
public class A070347 extends LinearRecurrence {

  /** Construct the sequence. */
  public A070347() {
    super(new long[] {1, -1, 1, -1, 1}, new long[] {1, 2, 4, 8, 16});
  }
}
