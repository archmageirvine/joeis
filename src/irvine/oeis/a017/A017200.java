package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017200 a(n) = (9*n+3)^4.
 * @author Sean A. Irvine
 */
public class A017200 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017200() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {81, 20736, 194481, 810000, 2313441});
  }
}
