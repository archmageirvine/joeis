package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158740 <code>a(n) = 72*n^2 + 1</code>.
 * @author Sean A. Irvine
 */
public class A158740 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158740() {
    super(new long[] {1, -3, 3}, new long[] {1, 73, 289});
  }
}
