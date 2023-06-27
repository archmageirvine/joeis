package irvine.oeis.a133;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A133271 Indices of 7-gonal numbers which are also centered 7-gonal numbers.
 * @author Sean A. Irvine
 */
public class A133271 extends LinearRecurrence {

  /** Construct the sequence. */
  public A133271() {
    super(1, new long[] {1, -13, 13}, new long[] {1, 8, 92});
  }
}
