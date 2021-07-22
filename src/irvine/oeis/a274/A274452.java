package irvine.oeis.a274;

import irvine.oeis.DistinctMultiplicativeClosureSequence;
import irvine.oeis.a000.A000930;

/**
 * A274452 Products of distinct Narayana's cow numbers (A000930).
 * @author Sean A. Irvine
 */
public class A274452 extends DistinctMultiplicativeClosureSequence {

  /** Construct the sequence. */
  public A274452() {
    super(new A000930());
    next();
  }
}
