package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022353 Fibonacci sequence beginning <code>0, 19</code>.
 * @author Sean A. Irvine
 */
public class A022353 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022353() {
    super(new long[] {1, 1}, new long[] {0, 19});
  }
}
