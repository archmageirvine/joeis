package irvine.oeis.a274;

import irvine.oeis.a052.A052963;
import irvine.oeis.closure.DistinctMultiplicativeClosureSequence;

/**
 * A274453 Products of distinct numbers in A052963.
 * @author Sean A. Irvine
 */
public class A274453 extends DistinctMultiplicativeClosureSequence {

  /** Construct the sequence. */
  public A274453() {
    super(new A052963());
    next();
  }
}
