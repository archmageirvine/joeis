package irvine.oeis.a174;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A174685 Indices i such that 2*A000326(i)+1 is also a pentagonal number.
 * @author Sean A. Irvine
 */
public class A174685 extends LinearRecurrence {

  /** Construct the sequence. */
  public A174685() {
    super(new long[] {1, -1, -1154, 1154, 1}, new long[] {0, 75, 244, 86359, 281384});
  }
}
