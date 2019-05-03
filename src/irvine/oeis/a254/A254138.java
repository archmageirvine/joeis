package irvine.oeis.a254;

import irvine.oeis.LinearRecurrence;

/**
 * A254138 Pentagonal numbers <code>(A000326)</code> which are also centered hexagonal numbers <code>(A003215)</code>.
 * @author Sean A. Irvine
 */
public class A254138 extends LinearRecurrence {

  /** Construct the sequence. */
  public A254138() {
    super(new long[] {1, -1, -1331714, 1331714, 1}, new long[] {1, 7957, 1185037, 10596309577L, 1578130224697L});
  }
}
