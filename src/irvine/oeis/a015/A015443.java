package irvine.oeis.a015;

import irvine.oeis.LinearRecurrence;

/**
 * A015443 Generalized Fibonacci numbers: a(n) = a(n-1) + 8*a(n-2).
 * @author Sean A. Irvine
 */
public class A015443 extends LinearRecurrence {

  /** Construct the sequence. */
  public A015443() {
    super(new long[] {8, 1}, new long[] {1, 1});
  }
}
