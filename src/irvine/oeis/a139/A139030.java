package irvine.oeis.a139;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A139030 Real part of (4 + 3i)^n.
 * @author Sean A. Irvine
 */
public class A139030 extends LinearRecurrence {

  /** Construct the sequence. */
  public A139030() {
    super(new long[] {-25, 8}, new long[] {4, 7});
  }
}
