package irvine.oeis.a112;

import irvine.oeis.FiniteSequence;

/**
 * A112090 Degrees of nonconstant complex polynomials f(x) and g(x) such that <code>(1)</code> neither f nor g can be written nontrivially as r(s(x)), <code>(2)</code> f(x) does not equal g(ax+b) for complex numbers <code>a,b</code> and <code>(3)</code> f(x)-g(y) is reducible as a complex polynomial in two variables.
 * @author Georg Fischer
 */
public class A112090 extends FiniteSequence {

  /** Construct the sequence. */
  public A112090() {
    super(7, 11, 13, 15, 21, 31);
  }
}
