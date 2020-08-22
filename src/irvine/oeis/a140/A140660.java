package irvine.oeis.a140;

import irvine.oeis.LinearRecurrence;

/**
 * A140660 a(n) = 3*4^n + 1.
 * @author Sean A. Irvine
 */
public class A140660 extends LinearRecurrence {

  /** Construct the sequence. */
  public A140660() {
    super(new long[] {-4, 5}, new long[] {4, 13});
  }
}
