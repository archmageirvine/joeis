package irvine.oeis.a334;

import irvine.oeis.PrependSequence;
import irvine.oeis.a000.A000217;
import irvine.oeis.closure.DistinctMultiplicativeClosureSequence;

/**
 * A334130 Numbers that can be written as a product of distinct triangular numbers.
 * @author Sean A. Irvine
 */
public class A334130 extends PrependSequence {

  /** Construct the sequence. */
  public A334130() {
    super(1, new DistinctMultiplicativeClosureSequence(new A000217().skip()), 0);
  }
}
