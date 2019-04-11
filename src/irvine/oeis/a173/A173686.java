package irvine.oeis.a173;

import irvine.oeis.LinearRecurrence;

/**
 * A173686 Periodic with period 12: repeat <code>[2,8,2,2,8,5,5,8,5,5,8</code>,2].
 * @author Sean A. Irvine
 */
public class A173686 extends LinearRecurrence {

  /** Construct the sequence. */
  public A173686() {
    super(new long[] {1, 0, 0, -1, 0, 0, 1, 0, 0}, new long[] {2, 8, 2, 2, 8, 5, 5, 8, 5});
  }
}
