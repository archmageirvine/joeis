package irvine.oeis.a193;

import irvine.oeis.LinearRecurrence;

/**
 * A193044.
 * @author Sean A. Irvine
 */
public class A193044 extends LinearRecurrence {

  /** Construct the sequence. */
  public A193044() {
    super(new long[] {-1, 2, 1, -5, 4}, new long[] {1, 0, 2, 5, 13});
  }
}
