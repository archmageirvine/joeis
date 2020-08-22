package irvine.oeis.a218;

import irvine.oeis.LinearRecurrence;

/**
 * A218724 a(n) = (21^n - 1)/20.
 * @author Sean A. Irvine
 */
public class A218724 extends LinearRecurrence {

  /** Construct the sequence. */
  public A218724() {
    super(new long[] {-21, 22}, new long[] {0, 1});
  }
}
