package irvine.oeis.a052;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A052531 If n is even then 2^n+1 otherwise 2^n.
 * @author Sean A. Irvine
 */
public class A052531 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052531() {
    super(new long[] {-2, 1, 2}, new long[] {2, 2, 5});
  }
}
