package irvine.oeis.a010;

import irvine.oeis.FiniteSequence;

/**
 * A010031 Weight distribution of any one of the five doubly-even binary [32,16,8] codes (quadratic residue, Reed-Muller, etc.).
 * @author Sean A. Irvine
 */
public class A010031 extends FiniteSequence {

  /** Construct the sequence. */
  public A010031() {
    super(1, 0, 620, 13888, 36518, 13888, 620, 0, 1);
  }
}
