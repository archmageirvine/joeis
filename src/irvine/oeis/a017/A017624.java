package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017624 <code>(12n+8)^8</code>.
 * @author Sean A. Irvine
 */
public class A017624 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017624() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {16777216, 25600000000L, 1099511627776L, 14048223625216L, 96717311574016L, 457163239653376L, 1677721600000000L, 5132188731375616L, 13685690504052736L});
  }
}
