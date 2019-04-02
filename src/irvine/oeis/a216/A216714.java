package irvine.oeis.a216;

import irvine.oeis.LinearRecurrence;

/**
 * A216714 a(n) = 2^(n-5) - A000931(n).
 * @author Sean A. Irvine
 */
public class A216714 extends LinearRecurrence {

  /** Construct the sequence. */
  public A216714() {
    super(new long[] {-2, -1, 1, 2}, new long[] {0, 1, 3, 6});
  }
}
