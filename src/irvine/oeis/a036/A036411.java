package irvine.oeis.a036;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A036411 9-gonal square numbers.
 * @author Sean A. Irvine
 */
public class A036411 extends LinearRecurrence {

  /** Construct the sequence. */
  public A036411() {
    super(new long[] {1, -1, -898, 898, 1}, new long[] {1, 9, 1089, 8281, 978121});
  }
}
