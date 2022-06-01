package irvine.oeis.a264;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A264447 a(n) = n*(n + 7)*(n + 14)*(n + 21)/24.
 * @author Sean A. Irvine
 */
public class A264447 extends LinearRecurrence {

  /** Construct the sequence. */
  public A264447() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 110, 276, 510, 825});
  }
}
