package irvine.oeis.a259;

import irvine.oeis.LinearRecurrence;

/**
 * A259211 Positive octagonal numbers (A000567) that are other octagonal numbers divided by 3.
 * @author Sean A. Irvine
 */
public class A259211 extends LinearRecurrence {

  /** Construct the sequence. */
  public A259211() {
    super(new long[] {1, -7300803, 7300803}, new long[] {560, 4090071480L, 29860802042948800L});
  }
}
