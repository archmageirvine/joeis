package irvine.oeis.a015;

import irvine.oeis.LinearRecurrence;

/**
 * A015447 Generalized Fibonacci numbers: a(n) = a(n-1) + 11*a(n-2).
 * @author Sean A. Irvine
 */
public class A015447 extends LinearRecurrence {

  /** Construct the sequence. */
  public A015447() {
    super(new long[] {11, 1}, new long[] {1, 1});
  }
}
