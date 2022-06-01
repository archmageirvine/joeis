package irvine.oeis.a016;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A016761 a(n) = (2*n+1)^9.
 * @author Sean A. Irvine
 */
public class A016761 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016761() {
    super(new long[] {-1, 10, -45, 120, -210, 252, -210, 120, -45, 10}, new long[] {1, 19683, 1953125, 40353607, 387420489, 2357947691L, 10604499373L, 38443359375L, 118587876497L, 322687697779L});
  }
}
