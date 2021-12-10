package irvine.oeis.a294;
// manually invbinom/binomtf at 2021-12-09 18:57

import irvine.oeis.PartialProductSequence;
import irvine.oeis.a000.A000009;
import irvine.oeis.transform.BinomialTransform;

/**
 * A294351 Product of first n terms of the binomial transform of the number of partitions into distinct parts (A000009).
 * @author Georg Fischer
 */
public class A294351 extends PartialProductSequence {

  /** Construct the sequence. */
  public A294351() {
    super(new BinomialTransform(new A000009(), 0));
  }
}
