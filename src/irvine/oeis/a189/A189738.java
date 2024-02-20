package irvine.oeis.a189;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A189738 a(1)=3, a(2)=4, a(n) = 3*a(n-1) + 4*a(n-2).
 * @author Sean A. Irvine
 */
public class A189738 extends LinearRecurrence {

  /** Construct the sequence. */
  public A189738() {
    super(1, new long[] {4, 3}, new long[] {3, 4});
  }
}
