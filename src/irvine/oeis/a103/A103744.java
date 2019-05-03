package irvine.oeis.a103;

import irvine.oeis.FiniteSequence;

/**
 * A103744 There are, up to equivalence <code>(i.e.</code>, symmetries and <code>rotations), 880</code> magic squares of order <code>4 (cf. A006052)</code>. Say that two squares are of the same type if one can be obtained from the other by complementing (replacing each entry i with <code>17-i)</code> and applying symmetries. There are 12 types. Sequence gives the population of each of the types, arranged in nondecreasing order.
 * @author Georg Fischer
 */
public class A103744 extends FiniteSequence {

  /** Construct the sequence. */
  public A103744() {
    super(8, 8, 48, 48, 48, 56, 56, 56, 56, 96, 96, 304);
  }
}
