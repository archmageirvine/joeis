package irvine.oeis.a102;

import irvine.oeis.LinearRecurrence;

/**
 * A102439 <code>a(n) = 100*n + 4</code>.
 * @author Sean A. Irvine
 */
public class A102439 extends LinearRecurrence {

  /** Construct the sequence. */
  public A102439() {
    super(new long[] {-1, 2}, new long[] {4, 104});
  }
}
