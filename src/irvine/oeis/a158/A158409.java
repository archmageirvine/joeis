package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158409 <code>a(n) = 900*n - 1</code>.
 * @author Sean A. Irvine
 */
public class A158409 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158409() {
    super(new long[] {-1, 2}, new long[] {899, 1799});
  }
}
