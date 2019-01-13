package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037603.
 * @author Sean A. Irvine
 */
public class A037603 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037603() {
    super(new long[] {-10, 1, 0, 10}, new long[] {1, 13, 130, 1301});
  }
}
