package irvine.oeis.a070;

import irvine.oeis.LinearRecurrence;

/**
 * A070354.
 * @author Sean A. Irvine
 */
public class A070354 extends LinearRecurrence {

  /** Construct the sequence. */
  public A070354() {
    super(new long[] {1, 0, 0, 0}, new long[] {1, 3, 9, 11});
  }
}
