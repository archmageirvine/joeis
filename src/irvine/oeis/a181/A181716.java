package irvine.oeis.a181;

import irvine.oeis.LinearRecurrence;

/**
 * A181716.
 * @author Sean A. Irvine
 */
public class A181716 extends LinearRecurrence {

  /** Construct the sequence. */
  public A181716() {
    super(new long[] {1, 2, 0}, new long[] {0, 1, 2});
  }
}
