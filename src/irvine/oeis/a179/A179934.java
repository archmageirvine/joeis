package irvine.oeis.a179;

import irvine.oeis.LinearRecurrence;

/**
 * A179934 a(n) red balls and b(n) blue balls in an urn; draw 2 balls without replacement; Probability(2 red balls)=6*Probability(2 blue balls); b(n)=A181442(n);.
 * @author Sean A. Irvine
 */
public class A179934 extends LinearRecurrence {

  /** Construct the sequence. */
  public A179934() {
    super(new long[] {1, -1, -10, 10, 1}, new long[] {4, 9, 36, 85, 352});
  }
}
