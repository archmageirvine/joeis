package irvine.oeis.a059;

import irvine.oeis.closure.DistinctAdditiveClosureSequence;
import irvine.oeis.a000.A000142;

/**
 * A059589 Sums of factorials of distinct integers.
 * @author Sean A. Irvine
 */
public class A059589 extends DistinctAdditiveClosureSequence {

  /** Construct the sequence. */
  public A059589() {
    super(new A000142());
    next(); // skip empty sum
  }
}
