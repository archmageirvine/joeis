package irvine.oeis.a064;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A064617 a(n) = (10^n-1)*(80/81)+n/9.
 * @author Sean A. Irvine
 */
public class A064617 extends LinearRecurrence {

  /** Construct the sequence. */
  public A064617() {
    super(new long[] {10, -21, 12}, new long[] {9, 98, 987});
  }
}
