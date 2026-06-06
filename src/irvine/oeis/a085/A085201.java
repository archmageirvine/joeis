package irvine.oeis.a085;

import irvine.lisp.SExpression;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a014.A014486;

/**
 * A085201 Array A(x,y): Position of the concatenation of binary strings A014486(x) &amp; A014486(y) in A014486, listed antidiagonalwise as A(0,0), A(1,0), A(0,1), A(2,0), A(1,1), A(0,2), ...
 * @author Sean A. Irvine
 */
public class A085201 extends Sequence0 {

  private final DirectSequence mA = DirectSequence.create(new A014486());
  private int mN = 0;
  private int mM = -1;

  protected Z t(final int n, final int m) {
    final SExpression x = SExpression.binexp2pars(mA.a(n));
    final SExpression y = SExpression.binexp2pars(mA.a(m));
    final Z concat = SExpression.append(x, y).toZ();
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
