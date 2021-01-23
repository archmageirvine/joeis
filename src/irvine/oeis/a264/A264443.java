package irvine.oeis.a264;

import irvine.oeis.LinearRecurrence;

/**
 * A264443 a(n) = n*(n + 5)*(n + 10)/6.
 * @author Sean A. Irvine
 */
public class A264443 extends LinearRecurrence {

  /** Construct the sequence. */
  public A264443() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 11, 28, 52});
  }
}
