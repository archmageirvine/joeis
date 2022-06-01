package irvine.oeis.a280;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A280173 a(0) = 1, a(n+1) = 2*a(n) + periodic sequence of length 2: repeat [5, -4].
 * @author Sean A. Irvine
 */
public class A280173 extends LinearRecurrence {

  /** Construct the sequence. */
  public A280173() {
    super(new long[] {-2, 1, 2}, new long[] {1, 7, 10});
  }
}
