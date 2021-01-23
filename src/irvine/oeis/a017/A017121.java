package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017121 a(n) = (8*n + 4)^9.
 * @author Sean A. Irvine
 */
public class A017121 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017121() {
    super(new long[] {-1, 10, -45, 120, -210, 252, -210, 120, -45, 10}, new long[] {262144, 5159780352L, 512000000000L, 10578455953408L, 101559956668416L, 618121839509504L, 2779905883635712L, 10077696000000000L, 31087100296429568L, 84590643846578176L});
  }
}
