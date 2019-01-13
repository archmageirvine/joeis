package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157736.
 * @author Sean A. Irvine
 */
public class A157736 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157736() {
    super(new long[] {1, -3, 3}, new long[] {119071, 938449, 2535751});
  }
}
