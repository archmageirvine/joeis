package irvine.oeis.a054;

import irvine.oeis.FiniteSequence;
import irvine.oeis.UnionSequence;
import irvine.oeis.a002.A002496;

/**
 * A054964 Numbers whose divisors have the form m^k + 1, k&gt;1.
 * @author Sean A. Irvine
 */
public class A054964 extends UnionSequence {

  /** Construct the sequence. */
  public A054964() {
    super(new A002496(), new FiniteSequence(1, 10));
  }
}
