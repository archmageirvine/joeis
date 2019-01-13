package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037638.
 * @author Sean A. Irvine
 */
public class A037638 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037638() {
    super(new long[] {-10, 1, 0, 10}, new long[] {2, 21, 213, 2132});
  }
}
