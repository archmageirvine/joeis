package irvine.oeis.a023;

import irvine.oeis.LinearRecurrence;

/**
 * A023865.
 * @author Sean A. Irvine
 */
public class A023865 extends LinearRecurrence {

  /** Construct the sequence. */
  public A023865() {
    super(new long[] {-1, 1, 3, -3, -3, 3, 1}, new long[] {1, 3, 11, 17, 38, 50, 90});
  }
}
