package irvine.oeis.a264;

import irvine.oeis.LinearRecurrence;

/**
 * A264851 a(n) = n*(n + 1)*(n + 2)*(4*n - 3)/6.
 * @author Sean A. Irvine
 */
public class A264851 extends LinearRecurrence {

  /** Construct the sequence. */
  public A264851() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 1, 20, 90, 260});
  }
}
