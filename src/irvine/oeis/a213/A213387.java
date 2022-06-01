package irvine.oeis.a213;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A213387 a(n) = 5*2^(n-1)-2-3*n.
 * @author Sean A. Irvine
 */
public class A213387 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213387() {
    super(new long[] {2, -5, 4}, new long[] {0, 2, 9});
  }
}
