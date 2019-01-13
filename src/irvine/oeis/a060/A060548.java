package irvine.oeis.a060;

import irvine.oeis.LinearRecurrence;

/**
 * A060548.
 * @author Sean A. Irvine
 */
public class A060548 extends LinearRecurrence {

  /** Construct the sequence. */
  public A060548() {
    super(new long[] {2, 0, 0, 0, 0, 0}, new long[] {2, 1, 2, 2, 2, 2});
  }
}
