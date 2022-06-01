package irvine.oeis.a138;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A138513 a(n) = 8*a(n-1) - 5*a(n-2).
 * @author Sean A. Irvine
 */
public class A138513 extends LinearRecurrence {

  /** Construct the sequence. */
  public A138513() {
    super(new long[] {-5, 8}, new long[] {1, 3});
  }
}
