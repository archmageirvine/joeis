package irvine.oeis.a286;

import irvine.oeis.LinearRecurrence;

/**
 * A286985.
 * @author Sean A. Irvine
 */
public class A286985 extends LinearRecurrence {

  /** Construct the sequence. */
  public A286985() {
    super(new long[] {-1, -2, 5, 4, -11, 6}, new long[] {7, 7, 39, 115, 343, 967});
  }
}
