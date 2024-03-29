package irvine.oeis.a110;
// Generated by gen_seq4.pl wroot at 2021-07-03 21:29

import irvine.oeis.a010.A010031;
import irvine.oeis.recur.PolynomialRootSequence;

/**
 * A110834 G.f.: 4th root of weight enumerator of [32,16,8] Reed-Muller code RM(2,5).
 * @author Georg Fischer
 */
public class A110834 extends PolynomialRootSequence {

  /** Construct the sequence. */
  public A110834() {
    super(0, 4, new A010031(), 9);
  }
}
