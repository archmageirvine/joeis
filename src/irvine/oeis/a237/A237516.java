package irvine.oeis.a237;

import irvine.oeis.LinearRecurrence;

/**
 * A237516.
 * @author Sean A. Irvine
 */
public class A237516 extends LinearRecurrence {

  /** Construct the sequence. */
  public A237516() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 15, 91, 325, 861});
  }
}
