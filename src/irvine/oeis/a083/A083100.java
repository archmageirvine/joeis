package irvine.oeis.a083;

import irvine.oeis.LinearRecurrence;

/**
 * A083100 a(n) = 2*a(n-1) + 7*a(n-2).
 * @author Sean A. Irvine
 */
public class A083100 extends LinearRecurrence {

  /** Construct the sequence. */
  public A083100() {
    super(new long[] {7, 2}, new long[] {1, 9});
  }
}
