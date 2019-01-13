package irvine.oeis.a265;

import irvine.oeis.LinearRecurrence;

/**
 * A265381.
 * @author Sean A. Irvine
 */
public class A265381 extends LinearRecurrence {

  /** Construct the sequence. */
  public A265381() {
    super(new long[] {-2, 1, 0, 0, 2}, new long[] {1, 3, 7, 14, 29});
  }
}
