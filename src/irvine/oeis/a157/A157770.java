package irvine.oeis.a157;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A157770 1482401250n^2 - 2134548900n + 768398401.
 * @author Sean A. Irvine
 */
public class A157770 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157770() {
    super(new long[] {1, -3, 3}, new long[] {116250751, 2428905601L, 7706362951L});
  }
}
