package irvine.oeis.a218;

import irvine.oeis.LinearRecurrence;

/**
 * A218725 a(n) = (22^n-1)/21.
 * @author Sean A. Irvine
 */
public class A218725 extends LinearRecurrence {

  /** Construct the sequence. */
  public A218725() {
    super(new long[] {-22, 23}, new long[] {0, 1});
  }
}
