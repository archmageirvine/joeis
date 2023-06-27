package irvine.oeis.a005;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A005348 Number of ways to add n ordinals.
 * @author Sean A. Irvine
 */
public class A005348 extends LinearRecurrence {

  /** Construct the sequence. */
  public A005348() {
    super(1, new long[] {81, 0, 0, 0, 0}, new long[] {216513, 531441, 1266273, 3017169, 7189057},
        new long[] {1, 2, 5, 13, 33, 81, 193, 449, 1089, 2673, 6561, 15633, 37249, 88209});
  }

}
