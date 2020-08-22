package irvine.oeis.a248;

import irvine.oeis.LinearRecurrence;

/**
 * A248339 a(n) = 22*n+19.
 * @author Sean A. Irvine
 */
public class A248339 extends LinearRecurrence {

  /** Construct the sequence. */
  public A248339() {
    super(new long[] {-1, 2}, new long[] {19, 41});
  }
}
