package irvine.oeis.a107;

import irvine.oeis.LinearRecurrence;

/**
 * A107464 Number of fuzzy subgroups of rank 3 cyclic group of order <code>(p^n)*q*r</code> where p, q and r are three distinct prime.
 * @author Sean A. Irvine
 */
public class A107464 extends LinearRecurrence {

  /** Construct the sequence. */
  public A107464() {
    super(new long[] {-8, 20, -18, 7}, new long[] {11, 51, 175, 527});
  }
}
