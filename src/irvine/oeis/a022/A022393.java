package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022393 Fibonacci sequence beginning <code>1, 23</code>.
 * @author Sean A. Irvine
 */
public class A022393 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022393() {
    super(new long[] {1, 1}, new long[] {1, 23});
  }
}
