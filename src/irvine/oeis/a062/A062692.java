package irvine.oeis.a062;
// manually partsum2 at 2022-12-26 20:38

import irvine.oeis.PartialSumSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a001.A001037;

/**
 * A062692 Number of irreducible polynomials over F_2 of degree at most n.
 * @author Georg Fischer
 */
public class A062692 extends PartialSumSequence {

  /** Construct the sequence. */
  public A062692() {
    super(1, new SkipSequence(new A001037(), 1));
  }
}
