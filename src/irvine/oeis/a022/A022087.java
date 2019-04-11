package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022087 Fibonacci sequence beginning <code>0, 4</code>.
 * @author Sean A. Irvine
 */
public class A022087 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022087() {
    super(new long[] {1, 1}, new long[] {0, 4});
  }
}
