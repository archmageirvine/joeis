package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158546.
 * @author Sean A. Irvine
 */
public class A158546 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158546() {
    super(new long[] {1, -3, 3}, new long[] {12, 156, 588});
  }
}
