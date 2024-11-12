package irvine.oeis.a369;
// manually 2024-11-03/dirichcon2 at 2024-11-10

import irvine.oeis.DirichletConvolutionSequence;
import irvine.oeis.a008.A008836;
import irvine.oeis.a083.A083345;

/**
 * A369069 Dirichlet convolution of Liouville&apos;s lambda (A008836) with A083345, where A083345(n) = n&apos; / gcd(n,n&apos;), and n&apos; stands for the arithmetic derivative of n, A003415.
 * @author Georg Fischer
 */
public class A369069 extends DirichletConvolutionSequence {

  /** Construct the sequence. */
  public A369069() {
    super(new A008836(), 1, new A083345(), 1);
  }
}
