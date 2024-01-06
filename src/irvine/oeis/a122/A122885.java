package irvine.oeis.a122;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A122885 a(n+1) = 4*a(n) + 11*a(n-1) - 2*a(n-2).
 * @author Sean A. Irvine
 */
public class A122885 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122885() {
    super(1, new long[] {-2, 11, 4}, new long[] {1, 13, 61});
  }
}
