package irvine.oeis.a237;

import irvine.oeis.LinearRecurrence;

/**
 * A237991.
 * @author Sean A. Irvine
 */
public class A237991 extends LinearRecurrence {

  /** Construct the sequence. */
  public A237991() {
    super(new long[] {1, -3, 3}, new long[] {1, 992, 3965});
  }
}
