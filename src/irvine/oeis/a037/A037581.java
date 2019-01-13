package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037581.
 * @author Sean A. Irvine
 */
public class A037581 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037581() {
    super(new long[] {-9, 1, 9}, new long[] {1, 12, 109});
  }
}
