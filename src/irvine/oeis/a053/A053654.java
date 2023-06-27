package irvine.oeis.a053;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A053654 Multiples of 123456789.
 * @author Sean A. Irvine
 */
public class A053654 extends LinearRecurrence {

  /** Construct the sequence. */
  public A053654() {
    super(1, new long[] {-1, 2}, new long[] {123456789, 246913578});
  }
}
