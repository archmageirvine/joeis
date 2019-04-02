package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042147 Denominators of continued fraction convergents to sqrt(598).
 * @author Sean A. Irvine
 */
public class A042147 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042147() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3148702, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 2, 9, 11, 174, 359, 5559, 5918, 29231, 64380, 3119471, 6303322, 28332759, 34636081, 547873974, 1130384029, 17503634409L, 18634018438L, 92039708161L, 202713434760L});
  }
}
