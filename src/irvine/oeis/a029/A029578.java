package irvine.oeis.a029;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A029578 The natural numbers interleaved with the even numbers.
 * @author Sean A. Irvine
 */
public class A029578 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029578() {
    super(new long[] {-1, 0, 2, 0}, new long[] {0, 0, 1, 2});
  }
}
