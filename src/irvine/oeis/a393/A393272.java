package irvine.oeis.a393;

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a277.A277473;

/**
 * A393272 a(0) = 0, a(n) = Sum_{k=1..n} binomial(n+1, k+1)*A000169(k) for n &gt; 0.
 * @author Sean A. Irvine
 */
public class A393272 extends PartialSumSequence {

  /** Construct the sequence. */
  public A393272() {
    super(0, new A277473());
  }
}
