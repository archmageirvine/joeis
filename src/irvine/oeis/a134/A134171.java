package irvine.oeis.a134;

import irvine.oeis.LinearRecurrence;

/**
 * A134171 a(n) = (9/2)*(n-1)*(n-2)*(n-3).
 * @author Sean A. Irvine
 */
public class A134171 extends LinearRecurrence {

  /** Construct the sequence. */
  public A134171() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 0, 0, 27});
  }
}
