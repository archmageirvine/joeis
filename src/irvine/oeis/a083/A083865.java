package irvine.oeis.a083;

import irvine.oeis.a007.A007691;
import irvine.oeis.closure.DistinctAdditiveClosureSequence;

/**
 * A083865 Sums of (one or more distinct) k-perfect numbers.
 * @author Sean A. Irvine
 */
public class A083865 extends DistinctAdditiveClosureSequence {

  /** Construct the sequence. */
  public A083865() {
    super(1, new A007691().skip());
    skip();
  }
}

