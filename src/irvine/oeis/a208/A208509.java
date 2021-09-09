package irvine.oeis.a208;
// manually 2021-09-04

import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;

/**
 * A208509 Triangle of coefficients of polynomials v(n,x) jointly generated with A208508; see the Formula section.
 * @author Georg Fischer
 */
public class A208509 extends A208508 {

  /** Construct the sequence. */
  public A208509() { // for V
    super();
  }

  /**
   * Generic constructor with parameters
   * @param variant: 1 = normal, 2 = add <code>nRow</code> to parameter d
   * @param a factor of u(n-1)
   * @param b factor of v(n-1)
   * @param c constant of u(n)
   * @param d factor of u(n-1)
   * @param e factor of v(n-1)
   * @param f constant of v(n)
   */
  public A208509(final int variant, final Polynomial<Z> a, final Polynomial<Z> b, final Polynomial<Z> c, final Polynomial<Z> d, final Polynomial<Z> e, final Polynomial<Z> f) {
    super(variant, a, b, c, d, e, f);
  }

  @Override
  public Z next() {
    ++mN;
    ++mCol;
    if (mCol > mV.degree()) {
      buildNextRow();
    }
    return mV.coeff(mCol); // V
  }
}
