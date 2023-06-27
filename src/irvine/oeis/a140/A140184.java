package irvine.oeis.a140;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A140184 a(n) = 2*a(n-1) + 16*a(n-2) + 16*a(n-3).
 * @author Sean A. Irvine
 */
public class A140184 extends LinearRecurrence {

  /** Construct the sequence. */
  public A140184() {
    super(1, new long[] {16, 16, 2}, new long[] {1, 14, 60});
  }
}
