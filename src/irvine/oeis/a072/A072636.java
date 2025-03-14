package irvine.oeis.a072;

import irvine.lisp.SExpression;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.a000.A000695;
import irvine.oeis.a014.A014486;

/**
 * A072636 Permutation of natural numbers induced by reranking plane binary trees given in the standard lexicographic order (A014486) with an "arithmetic global ranking algorithm", using packA054238tr as the packing bijection N X N -&gt; N.
 * @author Sean A. Irvine
 */
public class A072636 extends A014486 {

  private final DirectSequence mA695 = new A000695();

  private Z a054238(final Z x, final Z y) {
    return mA695.a(y).add(mA695.a(x).multiply2());
  }

  private Z pack(final SExpression s) {
    return !s.isPair() ? Z.ZERO : a054238(pack(s.car()), pack(s.cdr())).add(1);
  }

  @Override
  public Z next() {
    return pack(SExpression.binexp2pars(super.next()));
  }
}
