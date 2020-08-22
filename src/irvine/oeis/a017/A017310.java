package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017310 a(n) = (10*n + 3)^6.
 * @author Sean A. Irvine
 */
public class A017310 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017310() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {729, 4826809, 148035889, 1291467969, 6321363049L, 22164361129L, 62523502209L});
  }
}
