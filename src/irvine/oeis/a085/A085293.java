package irvine.oeis.a085;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A085293 Product of Lucas (A000204) and a Pell Companion series (A002203).
 * @author Sean A. Irvine
 */
public class A085293 extends LinearRecurrence {

  /** Construct the sequence. */
  public A085293() {
    super(1, new long[] {-1, 2, 7, 2}, new long[] {2, 18, 56, 238});
  }
}
