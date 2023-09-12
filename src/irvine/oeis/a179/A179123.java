package irvine.oeis.a179;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A179123 Place a(n) red and b(n) blue balls in an urn; draw 6 balls without replacement; Probability(6 red balls)=Probability(4 red and 2 blue balls); binomial(a(n),6)=binomial(a(n),4)*binomial(b(n),2).
 * @author Sean A. Irvine
 */
public class A179123 extends LinearRecurrence {

  /** Construct the sequence. */
  public A179123() {
    super(1, new long[] {1, -1, -8, 8, 1}, new long[] {5, 10, 14, 49, 80});
  }
}
