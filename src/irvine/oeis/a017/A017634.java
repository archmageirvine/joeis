package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017634.
 * @author Sean A. Irvine
 */
public class A017634 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017634() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {531441, 85766121, 1291467969, 8303765625L, 34296447249L, 107918163081L, 282429536481L});
  }
}
