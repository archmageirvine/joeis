package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022364 Fibonacci sequence beginning <code>0, 30</code>.
 * @author Sean A. Irvine
 */
public class A022364 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022364() {
    super(new long[] {1, 1}, new long[] {0, 30});
  }
}
