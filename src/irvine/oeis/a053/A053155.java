package irvine.oeis.a053;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A053155 Number of 3-element intersecting families (with not necessary distinct sets) of an n-element set.
 * @author Sean A. Irvine
 */
public class A053155 extends LinearRecurrence {

  /** Construct the sequence. */
  public A053155() {
    super(new long[] {5760, -14832, 14756, -7504, 2135, -343, 29}, new long[] {0, 1, 7, 50, 397, 3366, 29197});
  }
}
