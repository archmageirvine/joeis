package irvine.oeis.a218;

import irvine.oeis.LinearRecurrence;

/**
 * A218748 a(n) = (45^n-1)/44.
 * @author Sean A. Irvine
 */
public class A218748 extends LinearRecurrence {

  /** Construct the sequence. */
  public A218748() {
    super(new long[] {-45, 46}, new long[] {0, 1});
  }
}
