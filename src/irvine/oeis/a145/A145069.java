package irvine.oeis.a145;

import irvine.oeis.LinearRecurrence;

/**
 * A145069 a(n) = n*(n^2 + 3*n + 5)/3.
 * @author Sean A. Irvine
 */
public class A145069 extends LinearRecurrence {

  /** Construct the sequence. */
  public A145069() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 3, 10, 23});
  }
}
