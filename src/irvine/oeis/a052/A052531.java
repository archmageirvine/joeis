package irvine.oeis.a052;

import irvine.oeis.LinearRecurrence;

/**
 * A052531 If n is even then <code>2^n+1</code> otherwise <code>2^n</code>.
 * @author Sean A. Irvine
 */
public class A052531 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052531() {
    super(new long[] {-2, 1, 2}, new long[] {2, 2, 5});
  }
}
