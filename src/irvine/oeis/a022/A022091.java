package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022091 Fibonacci sequence beginning <code>0, 8</code>.
 * @author Sean A. Irvine
 */
public class A022091 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022091() {
    super(new long[] {1, 1}, new long[] {0, 8});
  }
}
