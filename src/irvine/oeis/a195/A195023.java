package irvine.oeis.a195;

import irvine.oeis.LinearRecurrence;

/**
 * A195023 a(n) = 14*n^2 - 4*n.
 * @author Sean A. Irvine
 */
public class A195023 extends LinearRecurrence {

  /** Construct the sequence. */
  public A195023() {
    super(new long[] {1, -3, 3}, new long[] {0, 10, 48});
  }
}
