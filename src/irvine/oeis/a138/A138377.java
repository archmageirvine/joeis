package irvine.oeis.a138;

import irvine.oeis.LinearRecurrence;

/**
 * A138377.
 * @author Sean A. Irvine
 */
public class A138377 extends LinearRecurrence {

  /** Construct the sequence. */
  public A138377() {
    super(new long[] {-4, 0, 0, 0}, new long[] {0, 1, 3, 2});
  }
}
