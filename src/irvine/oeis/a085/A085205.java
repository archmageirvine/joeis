package irvine.oeis.a085;

import irvine.lisp.SExpression;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a014.A014486;
import irvine.oeis.a057.A057547;

/**
 * A085205 Array A(x,y): induced by the 2-ary form of the list-function 'list' present in the programming languages Lisp and Scheme, in the same way as A085201 is induced by the 2-ary 'append'-function. Listed antidiagonalwise as A(0,0), A(1,0), A(0,1), A(2,0), A(1,1), A(0,2), ...
 * @author Sean A. Irvine
 */
public class A085205 extends Sequence0 {

  private final DirectSequence mA = DirectSequence.create(new A014486());
  private final DirectSequence mB = DirectSequence.create(new A057547());
  private int mN = 0;
  private int mM = -1;

  protected Z t(final int n, final int m) {
    final SExpression x = SExpression.binexp2pars(mA.a(n));
    final SExpression y = SExpression.binexp2pars(mB.a(m));
    final Z concat = SExpression.createTree(x, y).toZ();
    long k = Math.max(n, m);
    while (!mA.a(k).equals(concat)) {
      ++k;
    }
    return Z.valueOf(k);
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return t(mN - mM, mM);
  }
}
