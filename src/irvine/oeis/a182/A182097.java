package irvine.oeis.a182;

import irvine.oeis.LinearRecurrence;

/**
 * A182097.
 * @author Sean A. Irvine
 */
public class A182097 extends LinearRecurrence {

  /** Construct the sequence. */
  public A182097() {
    super(new long[] {1, 1, 0}, new long[] {1, 0, 1});
  }
}
