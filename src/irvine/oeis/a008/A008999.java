package irvine.oeis.a008;

import irvine.oeis.LinearRecurrence;

/**
 * A008999 a(n) = 2*a(n-1) + a(n-4).
 * @author Sean A. Irvine
 */
public class A008999 extends LinearRecurrence {

  /** Construct the sequence. */
  public A008999() {
    super(new long[] {1, 0, 0, 2}, new long[] {1, 2, 4, 8});
  }
}

