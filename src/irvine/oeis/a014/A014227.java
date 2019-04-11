package irvine.oeis.a014;

import irvine.oeis.FiniteSequence;

/**
 * A014227 Minimal number of initial pieces needed to reach level n in the Solitaire Army game on a hexagonal lattice <code>(a</code> finite sequence).
 * @author Sean A. Irvine
 */
public class A014227 extends FiniteSequence {

  /** Construct the sequence. */
  public A014227() {
    super(1, 2, 3, 5, 9, 17, 36, 145);
  }
}
