package irvine.oeis.a016;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A016998 a(n) = (7*n + 1)^6.
 * @author Sean A. Irvine
 */
public class A016998 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016998() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {1, 262144, 11390625, 113379904, 594823321, 2176782336L, 6321363049L});
  }
}
