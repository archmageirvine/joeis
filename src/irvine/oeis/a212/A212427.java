package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212427 <code>a(n) = 17*n + A000217(n-1)</code>.
 * @author Sean A. Irvine
 */
public class A212427 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212427() {
    super(new long[] {1, -3, 3}, new long[] {0, 17, 35});
  }
}
