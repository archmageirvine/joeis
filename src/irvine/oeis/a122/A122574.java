package irvine.oeis.a122;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A122574 a(1) = a(2) = 1, a(n) = -11*a(n-1) + a(n-2).
 * @author Sean A. Irvine
 */
public class A122574 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122574() {
    super(new long[] {1, -11}, new long[] {1, 1});
  }
}
