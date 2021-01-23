package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168029 n*(n^6+1)/2.
 * @author Sean A. Irvine
 */
public class A168029 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168029() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {0, 1, 65, 1095, 8194, 39065, 139971, 411775});
  }
}
