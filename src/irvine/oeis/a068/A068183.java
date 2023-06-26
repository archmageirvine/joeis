package irvine.oeis.a068;

import irvine.oeis.FiniteSequence;

/**
 * A068183 Largest number without decimal digits equal to 1 whose product of digits gives n!.
 * @author Georg Fischer
 */
public class A068183 extends FiniteSequence {

  /** Construct the sequence. */
  public A068183() {
    super(2, FINITE, 2, 32, 3222, 53222, 5332222, 75332222, 75332222222L, 7533332222222L, 755333322222222L);
  }
}
