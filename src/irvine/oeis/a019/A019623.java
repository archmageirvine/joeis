package irvine.oeis.a019;

import irvine.oeis.LinearRecurrence;

/**
 * A019623.
 * @author Sean A. Irvine
 */
public class A019623 extends LinearRecurrence {

  /** Construct the sequence. */
  public A019623() {
    super(new long[] {308, -149, 22}, new long[] {1, 22, 335});
  }
}
