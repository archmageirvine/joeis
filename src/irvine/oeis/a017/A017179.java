package irvine.oeis.a017;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A017179 (9n+1)^7.
 * @author Sean A. Irvine
 */
public class A017179 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017179() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {1, 10000000, 893871739, 13492928512L, 94931877133L, 435817657216L, 1522435234375L, 4398046511104L});
  }
}
