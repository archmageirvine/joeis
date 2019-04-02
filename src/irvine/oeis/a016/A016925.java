package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016925 a(n) = (6*n + 1)^5.
 * @author Sean A. Irvine
 */
public class A016925 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016925() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {1, 16807, 371293, 2476099, 9765625, 28629151});
  }
}
