package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037484.
 * @author Sean A. Irvine
 */
public class A037484 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037484() {
    super(new long[] {-7, 1, 7}, new long[] {1, 9, 64});
  }
}
