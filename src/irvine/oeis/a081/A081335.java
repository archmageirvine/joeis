package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081335 a(n) = (6^n + 2^n)/2.
 * @author Sean A. Irvine
 */
public class A081335 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081335() {
    super(new long[] {-12, 8}, new long[] {1, 4});
  }
}
