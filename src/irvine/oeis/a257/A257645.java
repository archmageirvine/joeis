package irvine.oeis.a257;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A257645 a(n) = 15*n + 14.
 * @author Sean A. Irvine
 */
public class A257645 extends LinearRecurrence {

  /** Construct the sequence. */
  public A257645() {
    super(new long[] {-1, 2}, new long[] {14, 29});
  }
}
