package irvine.oeis.a083;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A083575 a(0) = 6; for n&gt;0, a(n) = 2*a(n-1) - 1.
 * @author Sean A. Irvine
 */
public class A083575 extends LinearRecurrence {

  /** Construct the sequence. */
  public A083575() {
    super(new long[] {-2, 3}, new long[] {6, 11});
  }
}
