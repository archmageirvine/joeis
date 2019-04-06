package irvine.oeis.a320;

import irvine.oeis.FiniteSequence;

/**
 * A320726 Composite numbers such that all other numbers obtained from all permutations of all subsets of the digits are noncomposite.
 * @author Georg Fischer
 */
public class A320726 extends FiniteSequence {

  /** Construct the sequence. */
  public A320726() {
    super(4, 6, 8, 9, 10, 20, 22, 30, 32, 33, 35, 50, 55, 70, 77, 111);
  }
}
