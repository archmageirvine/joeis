package irvine.oeis.a015;

import irvine.oeis.LinearRecurrence;

/**
 * A015603 <code>a(n) = 11*a(n-1) + 9*a(n-2)</code>.
 * @author Sean A. Irvine
 */
public class A015603 extends LinearRecurrence {

  /** Construct the sequence. */
  public A015603() {
    super(new long[] {9, 11}, new long[] {0, 1});
  }
}
