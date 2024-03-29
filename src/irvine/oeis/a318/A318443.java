package irvine.oeis.a318;
// Generated by gen_seq4.pl dirisqrt at 2024-01-11 23:33

import irvine.oeis.DirichletSquareRootSequence;
import irvine.oeis.a018.A018804;

/**
 * A318443 Numerators of the sequence whose Dirichlet convolution with itself yields A018804, Pillai's arithmetical function: Sum_{k=1..n} gcd(k, n).
 * @author Georg Fischer
 */
public class A318443 extends DirichletSquareRootSequence {

  /** Construct the sequence. */
  public A318443() {
    super(1, new A018804(), NUM);
  }
}
