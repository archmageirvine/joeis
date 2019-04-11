package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022384 Fibonacci sequence beginning <code>4, 18</code>.
 * @author Sean A. Irvine
 */
public class A022384 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022384() {
    super(new long[] {1, 1}, new long[] {4, 18});
  }
}
