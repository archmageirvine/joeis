package irvine.oeis.a056;

import irvine.oeis.LinearRecurrence;

/**
 * A056118.
 * @author Sean A. Irvine
 */
public class A056118 extends LinearRecurrence {

  /** Construct the sequence. */
  public A056118() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {1, 16, 81, 266, 686, 1512});
  }
}
