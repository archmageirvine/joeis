package irvine.oeis.a292;
// manually 2022-12-26

import irvine.oeis.PartialSumSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a001.A001349;

/**
 * A292300 Number of connected graphs with at least 2 and at most n nodes.
 * @author Georg Fischer
 */
public class A292300 extends PartialSumSequence {

  /** Construct the sequence. */
  public A292300() {
    super(2, new SkipSequence(new A001349(), 2));
  }
}
