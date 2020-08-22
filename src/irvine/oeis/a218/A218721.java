package irvine.oeis.a218;

import irvine.oeis.LinearRecurrence;

/**
 * A218721 a(n) = (18^n-1)/17.
 * @author Sean A. Irvine
 */
public class A218721 extends LinearRecurrence {

  /** Construct the sequence. */
  public A218721() {
    super(new long[] {-18, 19}, new long[] {0, 1});
  }
}
