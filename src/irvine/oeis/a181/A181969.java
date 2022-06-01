package irvine.oeis.a181;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A181969 Prime-generating polynomial: 16*n^2 - 292*n + 1373.
 * @author Sean A. Irvine
 */
public class A181969 extends LinearRecurrence {

  /** Construct the sequence. */
  public A181969() {
    super(new long[] {1, -3, 3}, new long[] {1373, 1097, 853});
  }
}
