package irvine.oeis.a274;

import irvine.oeis.a000.A000129;
import irvine.oeis.closure.DistinctMultiplicativeClosureSequence;

/**
 * A274454 Products of distinct numbers in the Pell sequence (A000129).
 * @author Sean A. Irvine
 */
public class A274454 extends DistinctMultiplicativeClosureSequence {

  /** Construct the sequence. */
  public A274454() {
    super(new A000129().skip(1));
    next();
  }
}
