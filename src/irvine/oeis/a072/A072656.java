package irvine.oeis.a072;

import irvine.lisp.SExpression;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.a000.A000695;
import irvine.oeis.a014.A014486;
import irvine.oeis.a048.A048680;

/**
 * A072656 Permutation of natural numbers induced by reranking plane binary trees given in the standard lexicographic order (A014486) with an "arithmetic global ranking algorithm", using packA048680oA054238 as the packing bijection N X N -&gt; N.
 * @author Sean A. Irvine
 */
public class A072656 extends A014486 {

  private final DirectSequence mA000695 = new A000695();
  private final DirectSequence mA048680 = new A048680();

  private Z f(final Z x, final Z y) {
    return mA048680.a(mA000695.a(x).add(mA000695.a(y).multiply2()));
  }

  private Z pack(final SExpression s) {
    return !s.isPair() ? Z.ZERO : f(pack(s.car()), pack(s.cdr())).add(1);
  }

  @Override
  public Z next() {
    return pack(SExpression.binexp2pars(super.next()));
  }
}
