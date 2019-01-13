package irvine.oeis.a268;

import irvine.oeis.LinearRecurrence;

/**
 * A268044.
 * @author Sean A. Irvine
 */
public class A268044 extends LinearRecurrence {

  /** Construct the sequence. */
  public A268044() {
    super(new long[] {-1, 1, 1}, new long[] {3, 9, 13});
  }
}
