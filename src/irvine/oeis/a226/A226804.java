package irvine.oeis.a226;

import irvine.oeis.LinearRecurrence;

/**
 * A226804.
 * @author Sean A. Irvine
 */
public class A226804 extends LinearRecurrence {

  /** Construct the sequence. */
  public A226804() {
    super(new long[] {-59049, 29160, -3510, 120}, new long[] {1, 120, 10890, 914760});
  }
}
