package irvine.oeis.a072;

import irvine.lisp.SExpression;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a014.A014486;

/**
 * A072787 Permutation of natural numbers induced by reranking plane binary trees given in the standard lexicographic order (A014486) with an "arithmetic global ranking algorithm", using A072734 as the packing bijection N X N -&gt; N.
 * @author Sean A. Irvine
 */
public class A072787 extends A072734 {

  private final Sequence mA = new A014486();

  private Z pack(final SExpression s) {
    return s.isPair() ? packA072734(pack(s.car()), pack(s.cdr())).add(1) : Z.ZERO;
  }

  @Override
  public Z next() {
    return pack(SExpression.binexp2pars(mA.next()));
  }
}
