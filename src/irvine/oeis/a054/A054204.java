package irvine.oeis.a054;

import irvine.oeis.DistinctAdditiveClosureSequence;
import irvine.oeis.a001.A001906;

/**
 * A054204 Integers expressible as sums of distinct even-subscripted Fibonacci numbers.
 * @author Sean A. Irvine
 */
public class A054204 extends DistinctAdditiveClosureSequence {

  /** Construct the sequence. */
  public A054204() {
    super(new A001906());
    next();
  }
}

