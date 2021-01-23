package irvine.oeis.a077;

import irvine.oeis.LinearRecurrence;

/**
 * A077236 a(n) = 4*a(n-1) - a(n-2) with a(0) = 4 and a(1) = 11.
 * @author Sean A. Irvine
 */
public class A077236 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077236() {
    super(new long[] {-1, 4}, new long[] {4, 11});
  }
}
