package irvine.oeis.a135;

import irvine.oeis.LinearRecurrence;

/**
 * A135450.
 * @author Sean A. Irvine
 */
public class A135450 extends LinearRecurrence {

  /** Construct the sequence. */
  public A135450() {
    super(new long[] {4, -1, 0, 4}, new long[] {0, 0, 0, 1});
  }
}
