package irvine.oeis.a254;

import irvine.oeis.LinearRecurrence;

/**
 * A254641 Third partial sums of seventh powers (A001015).
 * @author Sean A. Irvine
 */
public class A254641 extends LinearRecurrence {

  /** Construct the sequence. */
  public A254641() {
    super(new long[] {1, -11, 55, -165, 330, -462, 462, -330, 165, -55, 11}, new long[] {1, 131, 2577, 23723, 141694, 636426, 2331462, 7323954, 20396871, 51550213, 120271151});
  }
}
