package irvine.oeis.a056;

import irvine.oeis.LinearRecurrence;

/**
 * A056473.
 * @author Sean A. Irvine
 */
public class A056473 extends LinearRecurrence {

  /** Construct the sequence. */
  public A056473() {
    super(new long[] {-24, 24, 26, -26, -9, 9, 1}, new long[] {0, 0, 0, 0, 0, 0, 1});
  }
}
