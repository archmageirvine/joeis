package irvine.oeis.a239;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A239909 Arises from a construction of equiangular lines in complex space of dimension 2.
 * @author Sean A. Irvine
 */
public class A239909 extends LinearRecurrence {

  /** Construct the sequence. */
  public A239909() {
    super(new long[] {-1, 1, 1, 1}, new long[] {1, 1, 2, 3});
  }
}
