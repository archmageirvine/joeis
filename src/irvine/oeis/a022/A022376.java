package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022376 Fibonacci sequence beginning <code>2, 28</code>.
 * @author Sean A. Irvine
 */
public class A022376 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022376() {
    super(new long[] {1, 1}, new long[] {2, 28});
  }
}
