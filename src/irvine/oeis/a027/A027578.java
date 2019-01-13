package irvine.oeis.a027;

import irvine.oeis.LinearRecurrence;

/**
 * A027578.
 * @author Sean A. Irvine
 */
public class A027578 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027578() {
    super(new long[] {1, -3, 3}, new long[] {30, 55, 90});
  }
}
