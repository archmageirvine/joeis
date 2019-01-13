package irvine.oeis.a085;

import irvine.oeis.LinearRecurrence;

/**
 * A085293.
 * @author Sean A. Irvine
 */
public class A085293 extends LinearRecurrence {

  /** Construct the sequence. */
  public A085293() {
    super(new long[] {-1, 2, 7, 2}, new long[] {2, 18, 56, 238});
  }
}
