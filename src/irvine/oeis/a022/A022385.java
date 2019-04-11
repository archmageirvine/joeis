package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022385 Fibonacci sequence beginning <code>4, 22</code>.
 * @author Sean A. Irvine
 */
public class A022385 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022385() {
    super(new long[] {1, 1}, new long[] {4, 22});
  }
}
