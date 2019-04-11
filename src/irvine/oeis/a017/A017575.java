package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017575 <code>(12n+4)^7</code>.
 * @author Sean A. Irvine
 */
public class A017575 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017575() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {16384, 268435456, 13492928512L, 163840000000L, 1028071702528L, 4398046511104L, 14645194571776L, 40867559636992L});
  }
}
