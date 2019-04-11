package irvine.oeis.a213;

import irvine.oeis.LinearRecurrence;

/**
 * A213071 <code>3*n*(9n + 2)*(18n - 1),</code> where n runs through the odd numbers <code>1, 3, 5,</code>...
 * @author Sean A. Irvine
 */
public class A213071 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213071() {
    super(new long[] {-1, 4, -6, 4}, new long[] {561, 13833, 62745, 170625});
  }
}
