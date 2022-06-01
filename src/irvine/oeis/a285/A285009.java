package irvine.oeis.a285;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A285009 Subset sums (see Comments).
 * @author Sean A. Irvine
 */
public class A285009 extends LinearRecurrence {

  /** Construct the sequence. */
  public A285009() {
    super(new long[] {1, -3, 3}, new long[] {9, 17, 28});
  }
}
