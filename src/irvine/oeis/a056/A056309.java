package irvine.oeis.a056;

import irvine.oeis.LinearRecurrence;

/**
 * A056309.
 * @author Sean A. Irvine
 */
public class A056309 extends LinearRecurrence {

  /** Construct the sequence. */
  public A056309() {
    super(new long[] {4, -6, 0, 3}, new long[] {0, 1, 4, 8});
  }
}
