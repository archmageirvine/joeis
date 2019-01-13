package irvine.oeis.a274;

import irvine.oeis.LinearRecurrence;

/**
 * A274032.
 * @author Sean A. Irvine
 */
public class A274032 extends LinearRecurrence {

  /** Construct the sequence. */
  public A274032() {
    super(new long[] {1, 1, -9}, new long[] {3, -9, 83});
  }
}
