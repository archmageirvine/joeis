package irvine.oeis.a213;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A213071 3*n*(9n + 2)*(18n - 1), where n runs through the odd numbers 1, 3, 5,...
 * @author Sean A. Irvine
 */
public class A213071 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213071() {
    super(1, new long[] {-1, 4, -6, 4}, new long[] {561, 13833, 62745, 170625});
  }
}
