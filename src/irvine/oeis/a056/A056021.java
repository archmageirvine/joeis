package irvine.oeis.a056;

import irvine.oeis.LinearRecurrence;

/**
 * A056021.
 * @author Sean A. Irvine
 */
public class A056021 extends LinearRecurrence {

  /** Construct the sequence. */
  public A056021() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {1, 7, 18, 24, 26});
  }
}
