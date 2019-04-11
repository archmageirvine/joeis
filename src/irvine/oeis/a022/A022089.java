package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022089 Fibonacci sequence beginning <code>0, 6</code>.
 * @author Sean A. Irvine
 */
public class A022089 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022089() {
    super(new long[] {1, 1}, new long[] {0, 6});
  }
}
