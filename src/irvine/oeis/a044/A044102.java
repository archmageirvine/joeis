package irvine.oeis.a044;

import irvine.oeis.LinearRecurrence;

/**
 * A044102 Multiples of 36.
 * @author Sean A. Irvine
 */
public class A044102 extends LinearRecurrence {

  /** Construct the sequence. */
  public A044102() {
    super(new long[] {-1, 2}, new long[] {0, 36});
  }
}
