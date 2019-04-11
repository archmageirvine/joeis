package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022134 Fibonacci sequence beginning <code>4, 17</code>.
 * @author Sean A. Irvine
 */
public class A022134 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022134() {
    super(new long[] {1, 1}, new long[] {4, 17});
  }
}
