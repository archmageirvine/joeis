package irvine.oeis.a024;

import irvine.oeis.LinearRecurrence;

/**
 * A024393.
 * @author Sean A. Irvine
 */
public class A024393 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024393() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {880, 12164, 80844, 363944, 1276009, 3751209, 9668253, 22494813, 48216663});
  }
}
