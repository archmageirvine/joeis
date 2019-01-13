package irvine.oeis.a192;

import irvine.oeis.LinearRecurrence;

/**
 * A192970.
 * @author Sean A. Irvine
 */
public class A192970 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192970() {
    super(new long[] {-1, 2, 1, -5, 4}, new long[] {0, 1, 3, 9, 21});
  }
}
