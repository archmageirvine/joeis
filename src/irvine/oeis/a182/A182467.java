package irvine.oeis.a182;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A182467 a(n) = 3a(n-1) - 2a(n-2) with a(0)=36 and a(1)=90.
 * @author Sean A. Irvine
 */
public class A182467 extends LinearRecurrence {

  /** Construct the sequence. */
  public A182467() {
    super(new long[] {-2, 3}, new long[] {36, 90});
  }
}
