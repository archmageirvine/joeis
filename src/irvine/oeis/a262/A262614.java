package irvine.oeis.a262;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A262614 Expansion of <code>phi(-x^3) * f(-x, -x^5) / psi(x)</code> in powers of x where <code>phi(), psi(), f(, )</code> are Ramanujan theta functions.
 * @author Georg Fischer
 */
public class A262614 extends EulerTransform {

  /** Construct the sequence. */
  public A262614() {
    super(new PeriodicSequence(-2, 1, -3, 1, -2, -1), 1);
  }
}
