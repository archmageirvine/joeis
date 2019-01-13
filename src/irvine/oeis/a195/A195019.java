package irvine.oeis.a195;

import irvine.oeis.LinearRecurrence;

/**
 * A195019.
 * @author Sean A. Irvine
 */
public class A195019 extends LinearRecurrence {

  /** Construct the sequence. */
  public A195019() {
    super(new long[] {-1, 0, 2, 0}, new long[] {3, 4, 6, 8});
  }
}
