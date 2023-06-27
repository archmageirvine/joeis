package irvine.oeis.a024;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A024393 4th elementary symmetric function of the first n+3 positive integers congruent to 2 mod 3.
 * @author Sean A. Irvine
 */
public class A024393 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024393() {
    super(1, new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {880, 12164, 80844, 363944, 1276009, 3751209, 9668253, 22494813, 48216663});
  }
}
