package irvine.oeis.a052;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A052905 a(n) = (n^2 + 7*n + 2)/2.
 * @author Sean A. Irvine
 */
public class A052905 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052905() {
    super(new long[] {1, -3, 3}, new long[] {1, 5, 10});
  }
}
