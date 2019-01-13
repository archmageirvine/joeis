package irvine.oeis.a053;

import irvine.oeis.LinearRecurrence;

/**
 * A053308.
 * @author Sean A. Irvine
 */
public class A053308 extends LinearRecurrence {

  /** Construct the sequence. */
  public A053308() {
    super(new long[] {1, -7, 19, -20, -14, 70, -98, 76, -35, 9}, new long[] {1, 9, 46, 175, 551, 1518, 3785, 8735, 18955, 39130});
  }
}
