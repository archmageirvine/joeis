package irvine.oeis.a078;

import irvine.oeis.LinearRecurrence;

/**
 * A078368 A Chebyshev S-sequence with Diophantine property.
 * @author Sean A. Irvine
 */
public class A078368 extends LinearRecurrence {

  /** Construct the sequence. */
  public A078368() {
    super(new long[] {-1, 19}, new long[] {1, 19});
  }
}
