package irvine.oeis.a017;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A017553 (12n+2)^9.
 * @author Sean A. Irvine
 */
public class A017553 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017553() {
    super(new long[] {-1, 10, -45, 120, -210, 252, -210, 120, -45, 10}, new long[] {512, 20661046784L, 5429503678976L, 165216101262848L, 1953125000000000L, 13537086546263552L, 66540410775079424L, 257327417311663616L, 833747762130149888L, 2357947691000000000L});
  }
}
