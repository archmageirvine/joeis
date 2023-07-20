package irvine.oeis.a274;

import irvine.oeis.closure.DistinctMultiplicativeClosureSequence;
import irvine.oeis.a000.A000213;

/**
 * A274432 Products of distinct tribonacci numbers (A000213).
 * @author Sean A. Irvine
 */
public class A274432 extends DistinctMultiplicativeClosureSequence {

  /** Construct the sequence. */
  public A274432() {
    super(new A000213());
    next();
  }
}
