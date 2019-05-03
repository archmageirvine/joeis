package irvine.oeis.a112;

import irvine.oeis.FiniteSequence;

/**
 * A112090 Degrees of nonconstant complex polynomials <code>f(x)</code> and <code>g(x)</code> such that <code>(1)</code> neither f nor g can be written nontrivially as <code>r(s(x)), (2) f(x)</code> does not equal <code>g(ax+b)</code> for complex numbers a,b and <code>(3) f(x)-g(y)</code> is reducible as a complex polynomial in two variables.
 * @author Georg Fischer
 */
public class A112090 extends FiniteSequence {

  /** Construct the sequence. */
  public A112090() {
    super(7, 11, 13, 15, 21, 31);
  }
}
