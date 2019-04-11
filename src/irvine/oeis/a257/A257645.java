package irvine.oeis.a257;

import irvine.oeis.LinearRecurrence;

/**
 * A257645 <code>a(n) = 15*n + 14</code>.
 * @author Sean A. Irvine
 */
public class A257645 extends LinearRecurrence {

  /** Construct the sequence. */
  public A257645() {
    super(new long[] {-1, 2}, new long[] {14, 29});
  }
}
