package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037684.
 * @author Sean A. Irvine
 */
public class A037684 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037684() {
    super(new long[] {-7, 1, 0, 0, 7}, new long[] {1, 7, 52, 366, 2563});
  }
}
