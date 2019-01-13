package irvine.oeis.a089;

import irvine.oeis.LinearRecurrence;

/**
 * A089074.
 * @author Sean A. Irvine
 */
public class A089074 extends LinearRecurrence {

  /** Construct the sequence. */
  public A089074() {
    super(new long[] {-1, 0, 0, 0, 2}, new long[] {0, 1, 3, 7, 14});
  }
}
