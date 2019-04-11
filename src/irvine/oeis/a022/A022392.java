package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022392 Fibonacci sequence beginning <code>1, 22</code>.
 * @author Sean A. Irvine
 */
public class A022392 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022392() {
    super(new long[] {1, 1}, new long[] {1, 22});
  }
}
