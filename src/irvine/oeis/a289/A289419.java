package irvine.oeis.a289;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A289419 Number of Dyck paths of semilength n and height exactly 6.
 * @author Sean A. Irvine
 */
public class A289419 extends LinearRecurrence {

  /** Construct the sequence. */
  public A289419() {
    super(new long[] {-4, 34, -86, 91, -46, 11}, new long[] {1, 11, 75, 410, 1975, 8778});
  }
}
