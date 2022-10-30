package irvine.oeis.a152;
// manually deris at 2021-10-28 22:51

import irvine.oeis.PartialProductSequence;

/**
 * A152687 Partial products operator applied thrice to nonzero Fibonacci numbers.
 *
 * @author Georg Fischer
 */
public class A152687 extends PartialProductSequence {

  /** Construct the sequence. */
  public A152687() {
    super(1, new A152686());
    next();
  }
}
