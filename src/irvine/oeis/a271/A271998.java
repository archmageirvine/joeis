package irvine.oeis.a271;

import irvine.oeis.LinearRecurrence;

/**
 * A271998.
 * @author Sean A. Irvine
 */
public class A271998 extends LinearRecurrence {

  /** Construct the sequence. */
  public A271998() {
    super(new long[] {-1, 2, 1, -4, 1, 2}, new long[] {30, 48, 80, 112, 162, 212});
  }
}
