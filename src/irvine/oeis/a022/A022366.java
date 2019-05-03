package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022366 Fibonacci sequence beginning <code>0, 32</code>.
 * @author Sean A. Irvine
 */
public class A022366 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022366() {
    super(new long[] {1, 1}, new long[] {0, 32});
  }
}
