package irvine.oeis.a282;

import irvine.oeis.LinearRecurrence;

/**
 * A282848.
 * @author Sean A. Irvine
 */
public class A282848 extends LinearRecurrence {

  /** Construct the sequence. */
  public A282848() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {4, 7, 10, 9, 12});
  }
}
