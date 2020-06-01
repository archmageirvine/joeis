package irvine.oeis.a179;

import irvine.oeis.LinearRecurrence;

/**
 * A179123 <code>a(n)</code> red and <code>b(n)</code> blue balls in an urn; draw 6 balls without replacement; <code>Probability(6</code> red <code>balls)=Probability(4</code> red and 2 blue balls); <code>binomial(a(n),6)=binomial(a(n),4)*binomial(b(n),2);</code>.
 * @author Sean A. Irvine
 */
public class A179123 extends LinearRecurrence {

  /** Construct the sequence. */
  public A179123() {
    super(new long[] {1, -1, -8, 8, 1}, new long[] {5, 10, 14, 49, 80});
  }
}
