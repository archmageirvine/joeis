package irvine.oeis.a070;

import irvine.oeis.LinearRecurrence;

/**
 * A070358.
 * @author Sean A. Irvine
 */
public class A070358 extends LinearRecurrence {

  /** Construct the sequence. */
  public A070358() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 3, 9, 27, 17, 19, 25, 11});
  }
}
