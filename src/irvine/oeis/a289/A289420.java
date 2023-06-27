package irvine.oeis.a289;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A289420 Number of Dyck paths of semilength n and height exactly 7.
 * @author Sean A. Irvine
 */
public class A289420 extends LinearRecurrence {

  /** Construct the sequence. */
  public A289420() {
    super(7, new long[] {4, -50, 166, -239, 174, -67, 13}, new long[] {1, 13, 102, 629, 3366, 16422, 75140});
  }
}
