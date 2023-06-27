package irvine.oeis.a159;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A159938 The number of homogeneous trisubstituted linear alkanes.
 * @author Sean A. Irvine
 */
public class A159938 extends LinearRecurrence {

  /** Construct the sequence. */
  public A159938() {
    super(2, new long[] {-1, 4, -6, 4}, new long[] {2, 6, 16, 36});
  }
}
