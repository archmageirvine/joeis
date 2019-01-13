package irvine.oeis.a020;

import irvine.oeis.LinearRecurrence;

/**
 * A020499.
 * @author Sean A. Irvine
 */
public class A020499 extends LinearRecurrence {

  /** Construct the sequence. */
  public A020499() {
    super(new long[] {495, -199, 25}, new long[] {1, 25, 426});
  }
}
