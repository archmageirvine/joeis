package irvine.oeis.a179;

import irvine.oeis.LinearRecurrence;

/**
 * A179934 <code>a(n)</code> red balls and <code>b(n)</code> blue balls in an urn; draw 2 balls without replacement; <code>Probability(2</code> red <code>balls)=6*Probability(2</code> blue balls); <code>b(n)=A181442(n);</code>.
 * @author Sean A. Irvine
 */
public class A179934 extends LinearRecurrence {

  /** Construct the sequence. */
  public A179934() {
    super(new long[] {1, -1, -10, 10, 1}, new long[] {4, 9, 36, 85, 352});
  }
}
