package irvine.oeis.a056;

import irvine.oeis.LinearRecurrence;

/**
 * A056453.
 * @author Sean A. Irvine
 */
public class A056453 extends LinearRecurrence {

  /** Construct the sequence. */
  public A056453() {
    super(new long[] {-2, 2, 1}, new long[] {0, 0, 2});
  }
}
