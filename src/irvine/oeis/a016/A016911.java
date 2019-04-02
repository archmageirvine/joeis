package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016911 a(n) = (6*n)^3.
 * @author Sean A. Irvine
 */
public class A016911 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016911() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 216, 1728, 5832});
  }
}
