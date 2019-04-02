package irvine.oeis.a274;

import irvine.oeis.LinearRecurrence;

/**
 * A274638 Main diagonal of A274637.
 * @author Sean A. Irvine
 */
public class A274638 extends LinearRecurrence {

  /** Construct the sequence. */
  public A274638() {
    super(new long[] {4, -6, 0, 3}, new long[] {0, 0, 3, 5});
  }
}
