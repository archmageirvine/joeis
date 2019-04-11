package irvine.oeis.a322;

import irvine.oeis.FiniteSequence;

/**
 * A322546 Numbers n such that every integer partition of n contains <code>a 1</code> or a prime power.
 * @author Georg Fischer
 */
public class A322546 extends FiniteSequence {

  /** Construct the sequence. */
  public A322546() {
    super(1, 2, 3, 4, 5, 7, 8, 9, 11, 13, 17, 19, 23);
  }
}
