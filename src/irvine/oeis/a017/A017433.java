package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017433 <code>(11n+3)^9</code>.
 * @author Sean A. Irvine
 */
public class A017433 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017433() {
    super(new long[] {-1, 10, -45, 120, -210, 252, -210, 120, -45, 10}, new long[] {19683, 20661046784L, 3814697265625L, 101559956668416L, 1119130473102767L, 7427658739644928L, 35452087835576229L, 134217728000000000L, 427929800129788411L, 1195092568622310912L});
  }
}
