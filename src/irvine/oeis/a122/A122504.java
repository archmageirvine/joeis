package irvine.oeis.a122;

import irvine.oeis.LinearRecurrence;

/**
 * A122504 a(n) = -a(n-6) + 3*a(n-5) + a(n-4) - 7*a(n-3) + a(n-2) + 3*a(n-1).
 * @author Sean A. Irvine
 */
public class A122504 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122504() {
    super(new long[] {-1, 3, 1, -7, 1, 3}, new long[] {1, 1, 1, 1, 1, 1});
  }
}
