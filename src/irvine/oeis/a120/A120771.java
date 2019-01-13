package irvine.oeis.a120;

import irvine.oeis.LinearRecurrence;

/**
 * A120771.
 * @author Sean A. Irvine
 */
public class A120771 extends LinearRecurrence {

  /** Construct the sequence. */
  public A120771() {
    super(new long[] {-1, 0, 0, 1, 0, 0, 2, 0, 0}, new long[] {1, 0, 0, 1, 1, 1, 3, 2, 1});
  }
}
