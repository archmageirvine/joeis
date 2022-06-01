package irvine.oeis.a291;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A291392 a(n) = (1/12)*A291391(n).
 * @author Sean A. Irvine
 */
public class A291392 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291392() {
    super(new long[] {-36, -72, -24, 12}, new long[] {1, 10, 90, 765});
  }
}
