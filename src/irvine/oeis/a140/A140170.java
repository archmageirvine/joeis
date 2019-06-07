package irvine.oeis.a140;

import irvine.oeis.FiniteSequence;

/**
 * A140170 Numbers n such that <code>n=s^pi(d_1)+s^pi(d_2)+...+s^pi(d_k)</code> where s is sum of its digits and <code>d_1d_2...d_k</code> is the decimal expansion of <code>n</code>.
 * @author Georg Fischer
 */
public class A140170 extends FiniteSequence {

  /** Construct the sequence. */
  public A140170() {
    super(1, 2, 42, 521, 4624, 347352);
  }
}
