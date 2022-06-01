package irvine.oeis.a254;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A254138 Pentagonal numbers (A000326) which are also centered hexagonal numbers (A003215).
 * @author Sean A. Irvine
 */
public class A254138 extends LinearRecurrence {

  /** Construct the sequence. */
  public A254138() {
    super(new long[] {1, -1, -1331714, 1331714, 1}, new long[] {1, 7957, 1185037, 10596309577L, 1578130224697L});
  }
}
