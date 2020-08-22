package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017155 a(n) = (8*n + 7)^7.
 * @author Sean A. Irvine
 */
public class A017155 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017155() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {823543, 170859375, 3404825447L, 27512614111L, 137231006679L, 506623120463L, 1522435234375L, 3938980639167L});
  }
}
