package irvine.oeis.a056;

import irvine.oeis.LinearRecurrence;

/**
 * A056126.
 * @author Sean A. Irvine
 */
public class A056126 extends LinearRecurrence {

  /** Construct the sequence. */
  public A056126() {
    super(new long[] {1, -3, 3}, new long[] {0, 9, 19});
  }
}
