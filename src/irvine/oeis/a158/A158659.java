package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158659 <code>a(n) = 784*n^2 + 28</code>.
 * @author Sean A. Irvine
 */
public class A158659 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158659() {
    super(new long[] {1, -3, 3}, new long[] {28, 812, 3164});
  }
}
