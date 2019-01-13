package irvine.oeis.a135;

import irvine.oeis.LinearRecurrence;

/**
 * A135694.
 * @author Sean A. Irvine
 */
public class A135694 extends LinearRecurrence {

  /** Construct the sequence. */
  public A135694() {
    super(new long[] {-1, 0, -1, 0}, new long[] {1, -1, -1, -1});
  }
}
