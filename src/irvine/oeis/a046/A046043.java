package irvine.oeis.a046;

import irvine.oeis.FiniteSequence;

/**
 * A046043 Autobiographical numbers (or curious <code>numbers)</code>: list of numbers m <code>= x_0 x_1 x_2 ... x_{b-1}</code> (written in base <code>b)</code> such that <code>x_i</code> is the number of "digits" in m that are equal to i, for all <code>i=0,...,b-1</code>.
 * @author Georg Fischer
 */
public class A046043 extends FiniteSequence {

  /** Construct the sequence. */
  public A046043() {
    super(1210, 2020, 21200, 3211000, 42101000, 521001000L, 6210001000L);
  }
}
