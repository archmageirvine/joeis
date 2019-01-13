package irvine.oeis.a135;

import irvine.oeis.LinearRecurrence;

/**
 * A135055.
 * @author Sean A. Irvine
 */
public class A135055 extends LinearRecurrence {

  /** Construct the sequence. */
  public A135055() {
    super(new long[] {1, 1, 1, 1, 1}, new long[] {-2, -1, 0, 1, 2});
  }
}
