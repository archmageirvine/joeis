package irvine.oeis.a017;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A017539 (12n+1)^7.
 * @author Sean A. Irvine
 */
public class A017539 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017539() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {1, 62748517, 6103515625L, 94931877133L, 678223072849L, 3142742836021L, 11047398519097L, 32057708828125L});
  }
}
