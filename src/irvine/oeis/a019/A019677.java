package irvine.oeis.a019;

import irvine.oeis.LinearRecurrence;

/**
 * A019677.
 * @author Sean A. Irvine
 */
public class A019677 extends LinearRecurrence {

  /** Construct the sequence. */
  public A019677() {
    super(new long[] {384, -176, 24}, new long[] {1, 24, 400});
  }
}
