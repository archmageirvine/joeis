package irvine.oeis.a017;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A017659 (12n+11)^7.
 * @author Sean A. Irvine
 */
public class A017659 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017659() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {19487171, 3404825447L, 64339296875L, 506623120463L, 2488651484819L, 9095120158391L, 27136050989627L, 69833729609375L});
  }
}
