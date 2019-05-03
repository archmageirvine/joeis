package irvine.oeis.a138;

import irvine.oeis.LinearRecurrence;

/**
 * A138997 First differences of Frobenius numbers for 6 successive numbers <code>A138986</code>.
 * @author Sean A. Irvine
 */
public class A138997 extends LinearRecurrence {

  /** Construct the sequence. */
  public A138997() {
    super(new long[] {-1, 0, 0, 0, 0, 2, 0, 0, 0, 0}, new long[] {1, 1, 1, 1, 8, 2, 2, 2, 2, 14});
  }
}
