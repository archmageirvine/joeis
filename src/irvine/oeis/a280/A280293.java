package irvine.oeis.a280;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A280293 a(0) = 3, a(n+1) = 2*a(n) + periodic sequence of length 2: repeat [-5, 4].
 * @author Sean A. Irvine
 */
public class A280293 extends LinearRecurrence {

  /** Construct the sequence. */
  public A280293() {
    super(new long[] {-2, 1, 2}, new long[] {3, 1, 6});
  }
}
