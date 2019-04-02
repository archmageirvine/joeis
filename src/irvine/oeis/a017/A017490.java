package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017490 (11*n+8)^6.
 * @author Sean A. Irvine
 */
public class A017490 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017490() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {262144, 47045881, 729000000, 4750104241L, 19770609664L, 62523502209L, 164206490176L});
  }
}
