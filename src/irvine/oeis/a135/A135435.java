package irvine.oeis.a135;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A135435 a(n) = a(n-4) + a(n-7) with a(0), ..., a(6) = [7,0,0,0,4,0,0].
 * @author Sean A. Irvine
 */
public class A135435 extends LinearRecurrence {

  /** Construct the sequence. */
  public A135435() {
    super(new long[] {1, 0, 0, 1, 0, 0, 0}, new long[] {7, 0, 0, 0, 4, 0, 0});
  }
}
