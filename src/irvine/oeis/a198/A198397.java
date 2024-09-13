package irvine.oeis.a198;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A198397 a(n) = 7^n - 7*n.
 * @author Sean A. Irvine
 */
public class A198397 extends LinearRecurrence {

  /** Construct the sequence. */
  public A198397() {
    super(new long[] {7, -15, 9}, new long[] {1, 0, 35});
  }
}
