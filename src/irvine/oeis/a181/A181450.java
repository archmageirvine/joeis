package irvine.oeis.a181;

import irvine.oeis.FiniteSequence;

/**
 * A181450 Numbers n such that 11 is the largest prime factor of <code>n^2 - 1</code>.
 * @author Georg Fischer
 */
public class A181450 extends FiniteSequence {

  /** Construct the sequence. */
  public A181450() {
    super(10, 21, 23, 34, 43, 65, 76, 89, 109, 111, 197, 199, 241, 351, 485, 769, 881, 1079, 6049, 19601);
  }
}
