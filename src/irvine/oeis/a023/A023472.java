package irvine.oeis.a023;

import irvine.oeis.LinearRecurrence;

/**
 * A023472 a(n) = n - 30.
 * @author Sean A. Irvine
 */
public class A023472 extends LinearRecurrence {

  /** Construct the sequence. */
  public A023472() {
    super(new long[] {-1, 2}, new long[] {-30, -29});
  }
}
