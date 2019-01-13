package irvine.oeis.a056;

import irvine.oeis.LinearRecurrence;

/**
 * A056161.
 * @author Sean A. Irvine
 */
public class A056161 extends LinearRecurrence {

  /** Construct the sequence. */
  public A056161() {
    super(new long[] {1, -1, -34, 34, 1}, new long[] {2, 7, 94, 263, 3218});
  }
}
