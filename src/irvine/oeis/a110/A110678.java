package irvine.oeis.a110;

import irvine.oeis.LinearRecurrence;

/**
 * A110678 a(n) = -n^2 - n + 72.
 * @author Sean A. Irvine
 */
public class A110678 extends LinearRecurrence {

  /** Construct the sequence. */
  public A110678() {
    super(new long[] {1, -3, 3}, new long[] {72, 70, 66});
  }
}
