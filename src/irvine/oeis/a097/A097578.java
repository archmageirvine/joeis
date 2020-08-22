package irvine.oeis.a097;

import irvine.oeis.LinearRecurrence;

/**
 * A097578 a(n) = (2*n+1)*2^floor((n+1)/2).
 * @author Sean A. Irvine
 */
public class A097578 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097578() {
    super(new long[] {-4, 0, 4, 0}, new long[] {1, 6, 10, 28});
  }
}
