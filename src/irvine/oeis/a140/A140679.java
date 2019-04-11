package irvine.oeis.a140;

import irvine.oeis.LinearRecurrence;

/**
 * A140679 <code>a(n) = n*(3*n+14)</code>.
 * @author Sean A. Irvine
 */
public class A140679 extends LinearRecurrence {

  /** Construct the sequence. */
  public A140679() {
    super(new long[] {1, -3, 3}, new long[] {0, 17, 40});
  }
}
