package irvine.oeis.a145;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A145027 a(n) = a(n-1) + a(n-2) + a(n-3) with a(1) = 2, a(2) = 3, a(3) = 4.
 * @author Sean A. Irvine
 */
public class A145027 extends LinearRecurrence {

  /** Construct the sequence. */
  public A145027() {
    super(1, new long[] {1, 1, 1}, new long[] {2, 3, 4});
  }
}
