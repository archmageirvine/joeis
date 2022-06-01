package irvine.oeis.a017;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A017598 (12n+6)^6.
 * @author Sean A. Irvine
 */
public class A017598 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017598() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {46656, 34012224, 729000000, 5489031744L, 24794911296L, 82653950016L, 225199600704L});
  }
}
