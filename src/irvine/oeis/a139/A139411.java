package irvine.oeis.a139;

import irvine.oeis.FiniteSequence;

/**
 * A139411 Numbers n such that pi(n)=10^pi(d_1)+10^pi(d_2)+...+10^pi(d_k) where d_1d_2...d_k is the decimal expansion of n.
 * @author Georg Fischer
 */
public class A139411 extends FiniteSequence {

  /** Construct the sequence. */
  public A139411() {
    super(1, FINITE, 227473, 227474, 227483, 227484, 239853, 239854);
  }
}
