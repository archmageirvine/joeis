package irvine.oeis.a274;

import irvine.oeis.LinearRecurrence;

/**
 * A274845.
 * @author Sean A. Irvine
 */
public class A274845 extends LinearRecurrence {

  /** Construct the sequence. */
  public A274845() {
    super(new long[] {4, 0, 0, 0, 3, 0, 0, 0}, new long[] {1, 0, 1, 1, 1, 1, 3, 3});
  }
}
