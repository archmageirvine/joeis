package irvine.oeis.a180;

import irvine.oeis.a000.A000043;
import irvine.oeis.closure.DistinctAdditiveClosureSequence;

/**
 * A180221 Numbers that can be written as sum of one or more distinct elements of A000043. Numbers k for which sigma(A180162(k))=2^k, k&gt;=2.
 * @author Sean A. Irvine
 */
public class A180221 extends DistinctAdditiveClosureSequence {

  /** Construct the sequence. */
  public A180221() {
    super(1, new A000043());
    next(); // skip 0
  }
}

