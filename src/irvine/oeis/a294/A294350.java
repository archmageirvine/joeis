package irvine.oeis.a294;
// manually invbinom/binomtf at 2021-12-09 18:57

import irvine.oeis.PartialProductSequence;
import irvine.oeis.a000.A000041;
import irvine.oeis.transform.BinomialTransform;

/**
 * A294350 Product of first n terms of the binomial transform of the partition function (A000041).
 * @author Georg Fischer
 */
public class A294350 extends PartialProductSequence {

  /** Construct the sequence. */
  public A294350() {
    super(new BinomialTransform(new A000041(), 0));
  }
}
