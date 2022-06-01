package irvine.oeis.a241;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A241170 Steffensen's bracket function [n,n-3].
 * @author Sean A. Irvine
 */
public class A241170 extends LinearRecurrence {

  /** Construct the sequence. */
  public A241170() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {6, 25, 67, 145, 275});
  }
}
