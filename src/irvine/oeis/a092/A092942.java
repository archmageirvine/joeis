package irvine.oeis.a092;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A092942 A Fibonacci sequence with "corrections" at every third step: -++-++-++-++-++..., i.e., at every 3rd step there is a subtraction instead of an addition.
 * @author Sean A. Irvine
 */
public class A092942 extends LinearRecurrence {

  /** Construct the sequence. */
  public A092942() {
    super(new long[] {-1, 0, 0, 2, 0, 0}, new long[] {0, 1, 1, 2, 3, 1});
  }
}
