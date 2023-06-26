package irvine.oeis.a051;

import irvine.oeis.FiniteSequence;

/**
 * A051250 Numbers whose reduced residue system consists of 1 and prime powers only.
 * @author Georg Fischer
 */
public class A051250 extends FiniteSequence {

  /** Construct the sequence. */
  public A051250() {
    super(1, FINITE, 1, 2, 3, 4, 5, 6, 8, 9, 10, 12, 14, 18, 20, 24, 30, 42, 60);
  }
}
