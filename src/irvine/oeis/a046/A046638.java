package irvine.oeis.a046;

import irvine.oeis.LinearRecurrence;

/**
 * A046638 Number of cubic residues mod 10^n, or number of distinct n-digit endings of cubes.
 * @author Sean A. Irvine
 */
public class A046638 extends LinearRecurrence {

  /** Construct the sequence. */
  public A046638() {
    super(new long[] {-10000, 1000, 0, 11330, -1133, 0, -1340, 134, 0, 10}, new long[] {1, 10, 63, 505, 5050, 47899, 466237, 4662370, 46308087, 461504593});
  }
}
