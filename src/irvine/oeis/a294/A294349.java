package irvine.oeis.a294;
// manually invbinom/binomtf at 2021-12-09 18:57

import irvine.oeis.PartialProductSequence;
import irvine.oeis.a000.A000032;
import irvine.oeis.transform.BinomialTransform;

/**
 * A294349 Product of first n terms of the binomial transform of the Lucas numbers (A000032).
 * @author Georg Fischer
 */
public class A294349 extends PartialProductSequence {

  /** Construct the sequence. */
  public A294349() {
    super(new BinomialTransform(new A000032(), 0));
  }
}
