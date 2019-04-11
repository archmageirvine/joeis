package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022086 Fibonacci sequence beginning <code>0, 3</code>.
 * @author Sean A. Irvine
 */
public class A022086 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022086() {
    super(new long[] {1, 1}, new long[] {0, 3});
  }
}
