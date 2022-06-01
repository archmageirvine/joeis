package irvine.oeis.a060;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A060485 Number of 7-block tricoverings of an n-set.
 * @author Sean A. Irvine
 */
public class A060485 extends LinearRecurrence {

  /** Construct the sequence. */
  public A060485() {
    super(new long[] {705600000, -1973160000, 2223560000L, -1355000500, 501056740, -118758569, 18470550, -1887459, 124120, -4991, 110}, new long[] {43, 4520, 244035, 10418070, 401861943, 14778678180L, 530817413155L, 18837147108890L, 664260814445943L, 23345018969140440L, 818942064306004275L});
  }
}
