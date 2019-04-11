package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017562 <code>(12n+3)^6</code>.
 * @author Sean A. Irvine
 */
public class A017562 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017562() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {729, 11390625, 387420489, 3518743761L, 17596287801L, 62523502209L, 177978515625L});
  }
}
