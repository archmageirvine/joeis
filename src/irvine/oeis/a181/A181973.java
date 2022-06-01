package irvine.oeis.a181;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A181973 Prime-generating polynomial: 16*n^2 - 300*n + 1447.
 * @author Sean A. Irvine
 */
public class A181973 extends LinearRecurrence {

  /** Construct the sequence. */
  public A181973() {
    super(new long[] {1, -3, 3}, new long[] {1447, 1163, 911});
  }
}
