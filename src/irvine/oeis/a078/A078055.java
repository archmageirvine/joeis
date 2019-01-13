package irvine.oeis.a078;

import irvine.oeis.LinearRecurrence;

/**
 * A078055.
 * @author Sean A. Irvine
 */
public class A078055 extends LinearRecurrence {

  /** Construct the sequence. */
  public A078055() {
    super(new long[] {-2, 2, -2}, new long[] {1, -3, 8});
  }
}
