package irvine.oeis.a135;

import irvine.oeis.LinearRecurrence;

/**
 * A135631.
 * @author Sean A. Irvine
 */
public class A135631 extends LinearRecurrence {

  /** Construct the sequence. */
  public A135631() {
    super(new long[] {-1, 2}, new long[] {0, 31});
  }
}
