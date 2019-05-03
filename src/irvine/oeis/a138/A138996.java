package irvine.oeis.a138;

import irvine.oeis.LinearRecurrence;

/**
 * A138996 First differences of Frobenius numbers for 5 successive numbers <code>A138985</code>.
 * @author Sean A. Irvine
 */
public class A138996 extends LinearRecurrence {

  /** Construct the sequence. */
  public A138996() {
    super(new long[] {-1, 0, 0, 0, 2, 0, 0, 0}, new long[] {1, 1, 1, 7, 2, 2, 2, 12});
  }
}
