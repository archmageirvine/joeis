package irvine.oeis.a294;
// manually invbinom/binomtf at 2021-12-09 18:57

import irvine.oeis.PartialProductSequence;
import irvine.oeis.a086.A086331;

/**
 * A294353 Product of first n terms of the binomial transform of n^n (A086331).
 * @author Georg Fischer
 */
public class A294353 extends PartialProductSequence {

  /** Construct the sequence. */
  public A294353() {
    super(new A086331());
  }
}
