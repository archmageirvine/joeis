package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037634.
 * @author Sean A. Irvine
 */
public class A037634 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037634() {
    super(new long[] {-6, 1, 0, 6}, new long[] {2, 13, 81, 488});
  }
}
